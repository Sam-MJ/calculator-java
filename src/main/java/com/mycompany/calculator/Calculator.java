package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Calculator {

    private Pattern operatorPattern = Pattern.compile("[*\\-+/=\\(\\)\\^]");

    private ArrayList<String> getInput(){
        ArrayList<String> inputList = new ArrayList<String>();

        Integer inputNumber;
        String operation = "";

        Scanner scanner = new Scanner(System.in);

        while (!operation.contains("=")) {

            System.out.println("Input a number");
            inputNumber = scanner.nextInt();
            inputList.add(inputNumber.toString());

            System.out.println("Input your operation");
            operation = scanner.next(operatorPattern).substring(0,1);
            inputList.add(operation);
        }

        scanner.close();
        return inputList;
    }

    public ArrayList<String> run(){
        ArrayList<String> inputs = getInput();
        ArrayList<String> reversePolishConvertedList = RPNConverter.shuntingYard(inputs);
        return reversePolishConvertedList;
    }
}
