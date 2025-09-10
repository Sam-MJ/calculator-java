package com.mycompany.calculator;
import java.util.ArrayList;

public class Evaluator {

    private static String operators = "[\\*\\/\\-\\+\\^]";

    private static Double getOperationResult(String operation, Double num1, Double num2){
        if (operation.equals("^")){
            return Operations.power(num1, num2);

        } else if (operation.equals("*")) {
            return Operations.multiply(num1, num2);

        } else if (operation.equals("/")) {
            return Operations.divide(num1, num2);

        } else if (operation.equals("+")) {
            return Operations.add(num1, num2);

        } else if (operation.equals("-")) {
            return Operations.subtract(num1, num2);
        } else {
            throw new ArithmeticException("Invalid operator used");
        }
    }

    public static Double evaluate(ArrayList<String> reversePolishQueue) {

        if (reversePolishQueue.isEmpty()){
            return 0.0;
        }

        ArrayList<Double> evaluationStack = new ArrayList<Double>();

        while (!reversePolishQueue.isEmpty()){
            String token = reversePolishQueue.removeFirst();

            if (token.matches(operators)){

                if (evaluationStack.size() < 2){
                    throw new ArithmeticException("Invalid mathmatical expression");
                }

                Double num2 = evaluationStack.removeLast();
                Double num1 = evaluationStack.removeLast();

                evaluationStack.add(getOperationResult(token, num1, num2));

            } else {
                evaluationStack.add(Double.parseDouble(token));
            }
        }

        return evaluationStack.getLast();
    }
}
