package com.company.dolgikh;

public class Number5 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 10;  i++) {
            sum = sum + 1.0 / i;
            System.out.printf("Число %d: %.4f%n", i, sum);
        }
    }
}
