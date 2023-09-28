package com.company.dolgikh;

public class Number7 {
    public static void main(String[] args) {
        int number = 4;
        int factorial = calculateFactorial(number);
        System.out.println("Факториал числа" + number + " равен " + factorial);
    }

    private static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
