package com.mycompany.calculator;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Double answer = calculator.run();

        System.out.println(answer);
    }
}
