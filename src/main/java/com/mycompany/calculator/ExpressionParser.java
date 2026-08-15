package com.mycompany.calculator;
import java.util.ArrayList;

public class ExpressionParser {

    public static ArrayList<String> parse(String input){

        if (!input.endsWith("=")) {
            throw new ArithmeticException("Expressions must end with =");
        }

        ArrayList<String> result = new ArrayList<String>();
        String buffer = "";

        for (char item : input.toCharArray()){

            if (Character.isDigit(item)){
                buffer += item;

            } else if(Operators.OPERATOR_SET.contains(item) || item == '=') {

                if (!buffer.isEmpty()){
                    result.add(buffer);
                    buffer = "";
                }

                result.add(Character.toString(item));

            } else {
                throw new ArithmeticException(String.format("Expression can only only contain digits or mathematical operators and not: %s", item));
            }
        }

        if (!buffer.isEmpty()){
            result.add(buffer);
        }

        return result;
    }
}
