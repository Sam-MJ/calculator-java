package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class RPNConverterTest {

    @Test
    public void simpleRPNTest(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("1","+", "2", "*", "3", "="));
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3", "*", "+"));

        ArrayList<String> result = RPNConverter.shuntingYard(testData);

        assertEquals(result, expected);
    }

    @Test
    public void emptyTest(){

        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("="));
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList());

        ArrayList<String> result = RPNConverter.shuntingYard(testData);

        assertEquals(result, expected);
    }

    @Test
    public void oneToken(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("1","="));
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("1"));

        ArrayList<String> result = RPNConverter.shuntingYard(testData);

        assertEquals(result, expected);
    }

    @Test
    public void orderOfOperationsTest(){
        ArrayList<String> testData = new ArrayList<String>(
            Arrays.asList("2", "+", "3", "^", "2", "-", "6", "/", "2", "*", "2", "=")
        );
        ArrayList<String> expected = new ArrayList<String>(
            Arrays.asList("2", "3", "2", "^", "+", "6", "2", "/", "2", "*", "-")
        );

        ArrayList<String> result = RPNConverter.shuntingYard(testData);

        assertEquals(result, expected);
    }

    @Test
    public void simpleBracketsTest(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("2","*", "(", "3", "+", "3", ")", "="));
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("2","3","3","+","*"));

        ArrayList<String> result = RPNConverter.shuntingYard(testData);

        assertEquals(result, expected);
    }

    @Test
    public void nestedBracketsTest(){
        ArrayList<String> testData = new ArrayList<String>(
            Arrays.asList("(", "(", "2", "+", "3", ")", "*", "(", "4", "-", "(", "1", "+", "1", ")", ")", ")", "^", "2", "=")
        );

        ArrayList<String> expected = new ArrayList<String>(
            Arrays.asList("2", "3", "+", "4", "1", "1", "+", "-", "*", "2", "^")
        );

        ArrayList<String> result = RPNConverter.shuntingYard(testData);

        assertEquals(result, expected);
    }
}
