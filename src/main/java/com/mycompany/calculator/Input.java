package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static ArrayList<String> getInput(){

        ArrayList<String> inputList = new ArrayList<String>();
        String token = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input each part of your expression followed by enter.");
        while (!token.contains("=")) {

            try {
                token = scanner.next(Operators.OPERATOR_PATTERN);
                inputList.add(token);
                System.out.println(String.join( " ",inputList));

            } catch (InputMismatchException e) {
                System.out.println("You can only input digits or mathematical operators");
                scanner.next();
            }

        }

        scanner.close();
        return inputList;
    }

    public static ArrayList<String> parseInput(String input){
        ArrayList<String> result = ExpressionParser.parse(input);
        return result;
    }

}
