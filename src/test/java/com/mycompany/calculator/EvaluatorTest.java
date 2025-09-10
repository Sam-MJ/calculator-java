package com.mycompany.calculator;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class EvaluatorTest {

    @Test
    public void simpleEvaluatorTestAdd(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("1", "2","+"));
        Double expected = 3.0;
        Double result = Evaluator.evaluate(testData);

        assertEquals(expected, result);
    }

    @Test
    public void simpleEvaluatorTestSubtract(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("1", "2","-"));
        Double expected = -1.0;
        Double result = Evaluator.evaluate(testData);

        assertEquals(expected, result);
    }

    @Test
    public void simpleEvaluatorTestMultiply(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("2", "2","*"));
        Double expected = 4.0;
        Double result = Evaluator.evaluate(testData);

        assertEquals(expected, result);
    }

    @Test
    public void simpleEvaluatorTestDivide(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("4", "2","/"));
        Double expected = 2.0;
        Double result = Evaluator.evaluate(testData);

        assertEquals(expected, result);
    }

    @Test
    public void simpleEvaluatorTestPower(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("2", "4","^"));
        Double expected = 16.0;
        Double result = Evaluator.evaluate(testData);

        assertEquals(expected, result);
    }

    @Test
    public void emptyEvaluatorTest(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList());
        Double expected = 0.0;
        Double result = Evaluator.evaluate(testData);

        assertEquals(expected, result);
    }

    @Test
    public void invalidExpressionEvaluatorTest(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("1","-"));

        assertThrows(ArithmeticException.class, () -> Evaluator.evaluate(testData));
    }

    @Test
    public void complexEvaluationTest(){
        ArrayList<String> testData = new ArrayList<String>(
            Arrays.asList("2", "3", "2", "^", "+", "6", "2", "/", "2", "*", "-")
        );
        Double expected = 5.0;
        Double result = Evaluator.evaluate(testData);

        assertEquals(expected, result);
    }


}
