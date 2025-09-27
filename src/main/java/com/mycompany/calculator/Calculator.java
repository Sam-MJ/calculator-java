package com.mycompany.calculator;

import java.util.ArrayList;

public class Calculator {

    public Double run(String[] args){
        ArrayList<String> inputs;

        if (args.length == 0){
            inputs = Input.getInput();
        } else {
            inputs = Input.parseInput(args[0]);
        }

        ArrayList<String> reversePolishConvertedList = RPNConverter.shuntingYard(inputs);
        return Evaluator.evaluate(reversePolishConvertedList);
    }
}
