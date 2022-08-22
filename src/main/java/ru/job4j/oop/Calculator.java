package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int a) {
        return a + x;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int multiply(int c) {
        return c * x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int y) {
        return Calculator.sum(y) + Calculator.minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int multiplyResult = calculator.multiply(6);
        System.out.println(multiplyResult);
        int divideResult = calculator.divide(100);
        System.out.println(divideResult);
        System.out.println(Calculator.sum(10));
        System.out.println(Calculator.minus(13));
        int sumAllOperations = calculator.sumAllOperation(10);
        System.out.println(sumAllOperations);
    }
}
