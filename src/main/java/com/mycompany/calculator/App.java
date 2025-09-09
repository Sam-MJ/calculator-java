package com.mycompany.calculator;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Calculator calculator = new Calculator();
        ArrayList<String> answer = calculator.run();
        System.out.println(answer);
    }
}
