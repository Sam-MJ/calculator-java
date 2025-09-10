package com.mycompany.calculator;

import java.util.ArrayList;

public class Calculator {

    public ArrayList<String> run(){
        ArrayList<String> inputs = Input.getInput();
        ArrayList<String> reversePolishConvertedList = RPNConverter.shuntingYard(inputs);
        return reversePolishConvertedList;
    }
}
