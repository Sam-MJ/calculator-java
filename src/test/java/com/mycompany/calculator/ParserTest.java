package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ParserTest {
    @Test
    public void SimpleParserTest(){
        String testData = "1+1";
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("1", "+", "1"));

        ArrayList<String> result = ExpressionParser.parse(testData);

        assertEquals(expected, result);
    }

    @Test
    public void MultipleItemsTest(){
        String testData = "(9+3)÷(2x(7-5))-1";
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList( "(" , "9" , "+" , "3" , ")" , "÷" , "(" , "2" , "x" , "(" , "7" , "-" , "5" , ")" , ")" , "-" , "1"));

        ArrayList<String> result = ExpressionParser.parse(testData);

        assertEquals(expected, result);
    }

    @Test
    public void MultidigitNumbersTest(){
        String testData = "(1200+4500)x(8000-3000)÷100-250";
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList( "(" , "1200" , "+" , "4500" , ")" , "x" , "(" , "8000" , "-" , "3000" , ")" , "÷" , "100" , "-" , "250"));

        ArrayList<String> result = ExpressionParser.parse(testData);

        assertEquals(expected, result);
    }
}
