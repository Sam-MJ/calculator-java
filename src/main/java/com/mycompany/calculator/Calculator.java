package com.mycompany.calculator;

import java.util.ArrayList;

public class Calculator {

    public Double run(String[] args){

        ArrayList<String> inputs = Input.getInput(args);
        ArrayList<String> reversePolishConvertedList = RPNConverter.shuntingYard(inputs);
        return Evaluator.evaluate(reversePolishConvertedList);
    }
}
