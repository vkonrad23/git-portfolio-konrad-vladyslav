// Utility class for math helper methods

package com.example;

public class MathUtils {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static int absolute(int number) {
        return Math.abs(number);
    }
}