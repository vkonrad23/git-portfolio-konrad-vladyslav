package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Console Calculator");
        System.out.println("Choose operation: +, -, *, / or type 'exit' to quit");

        while (true) {
            System.out.print("\nOperation: ");
            String operation = scanner.nextLine().trim();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            if (!isSupportedOperation(operation)) {
                System.out.println("Unsupported operation. Use one of: +, -, *, /");
                continue;
            }

            System.out.print("Enter numbers separated by spaces: ");
            String numbersInput = scanner.nextLine().trim();
            List<Double> numbers = parseNumbers(numbersInput);

            if (numbers.size() < 2) {
                System.out.println("Please enter at least two valid numbers.");
                continue;
            }

            try {
                double result = calculate(calculator, operation, numbers);
                System.out.println("Result: " + result);
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

    private static boolean isSupportedOperation(String operation) {
        return operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/");
    }

    private static List<Double> parseNumbers(String input) {
        List<Double> numbers = new ArrayList<>();
        if (input.isBlank()) {
            return numbers;
        }

        String[] tokens = input.split("\\s+");
        for (String token : tokens) {
            try {
                numbers.add(Double.parseDouble(token));
            } catch (NumberFormatException ex) {
                return new ArrayList<>();
            }
        }
        return numbers;
    }

    private static double calculate(Calculator calculator, String operation, List<Double> numbers) {
        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            double next = numbers.get(i);
            switch (operation) {
                case "+":
                    result = calculator.add(result, next);
                    break;
                case "-":
                    result = calculator.subtract(result, next);
                    break;
                case "*":
                    result = calculator.multiply(result, next);
                    break;
                case "/":
                    result = calculator.divide(result, next);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operation: " + operation);
            }
        }
        return result;
    }
}
