package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class RPNConverterTest {

    @Test
    public void SimpleRPNTest(){
        ArrayList<String> testData = new ArrayList<String>(Arrays.asList("1","+", "2", "*", "3", "="));
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3", "*", "+"));

        ArrayList<String> result = RPNConverter.shuntingYard(testData);

        assertEquals(result, expected);
    }
}
