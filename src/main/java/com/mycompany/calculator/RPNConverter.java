package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.HashMap;

public class RPNConverter {

    private static int getPrecedence(String operator) {
        HashMap<String, Integer> operators = new HashMap<String, Integer>();
        operators.put("^", 5);
        operators.put("/", 4);
        operators.put("*", 3);
        operators.put("+", 2);
        operators.put("-", 1);

        return operators.get(operator);
    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static ArrayList<String> shuntingYard(ArrayList<String> inputList){
        /*
            Convert from inline prefix to reverse polish notation
        */
        ArrayList<String> reversePolishStack = new ArrayList<String>();
        ArrayList<String> operatorStack = new ArrayList<String>();

        // pop equals off
        inputList.removeLast();

        for (String item : inputList) {
            if (isNumeric(item)){
                reversePolishStack.add(item);

            } else if (item.contentEquals("(")) {
                operatorStack.add(item);

            } else if (item.contentEquals(")")) {

                while (!operatorStack.isEmpty() && !operatorStack.getLast().contentEquals("(")) {
                    reversePolishStack.add(operatorStack.removeLast());
                }

                //Remove the open bracket
                if (!operatorStack.isEmpty()) {
                    operatorStack.removeLast();
                }

            } else {
                // if operator is higher in bidmas than the one at the top of the operator stack, add it, if not pop the higher one onto the RPL list
                while (!operatorStack.isEmpty() && getPrecedence(item) <= getPrecedence(operatorStack.getLast())) {
                    reversePolishStack.add(operatorStack.removeLast());
                }

                operatorStack.add(item);
            }
        }

        while (!operatorStack.isEmpty()) {
            reversePolishStack.add(operatorStack.removeLast());
        }

        return reversePolishStack;
    }
}
