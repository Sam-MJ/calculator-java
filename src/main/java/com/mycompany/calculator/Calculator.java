package com.mycompany.calculator;

import java.util.ArrayList;

public class Calculator {

    public Double run(){
        ArrayList<String> inputs = Input.getInput();
        ArrayList<String> reversePolishConvertedList = RPNConverter.shuntingYard(inputs);
        return Evaluator.evaluate(reversePolishConvertedList);
    }
}
