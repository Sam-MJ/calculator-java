package com.mycompany.calculator;

public class Operations {
    public static Double add(Double number1, Double number2) {
        return number1 + number2;
    }

    public static Double subtract(Double number1, Double number2) {
        return number1 - number2;
    }

    public static Double multiply(Double number1, Double number2) {
        return number1 * number2;
    }

    public static Double divide(Double number1, Double number2) {
        return number1 / number2;
    }

    public static Double power(Double num, Double exponent){
        return Math.pow(num, exponent);
    }
}
