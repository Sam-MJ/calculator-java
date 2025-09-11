package com.mycompany.calculator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Double answer = calculator.run();

        System.out.println(answer);
    }
}
