package com.mycompany.calculator;
import java.util.ArrayList;

public class ExpressionParser {

    public static ArrayList<String> parse(String input){

        ArrayList<String> result = new ArrayList<String>();
        String buffer = "";

        for (char item : input.toCharArray()){

            if (Character.isDigit(item)){
                buffer += item;

            } else {

                if (!buffer.isEmpty()){
                    result.add(buffer);
                    buffer = "";
                }

                result.add(Character.toString(item));
            }
        }

        if (!buffer.isEmpty()){
            result.add(buffer);
        }

        return result;
    }
}
