// This file is part of the git-portfolio-konrad-vladyslav project.

package com.example;

public class Calculator {
    private final Operations operations;

    public Calculator() {
        this.operations = new Operations();
    }

    public int add(int a, int b) {
        return operations.add(a, b);
    }

    public double add(double a, double b) {
        return operations.add(a, b);
    }

    public int subtract(int a, int b) {
        return operations.subtract(a, b);
    }

    public double subtract(double a, double b) {
        return operations.subtract(a, b);
    }

    public int multiply(int a, int b) {
        return operations.multiply(a, b);
    }

    public double multiply(double a, double b) {
        return operations.multiply(a, b);
    }

    public double divide(int a, int b) {
        return operations.divide(a, b);
    }

    public double divide(double a, double b) {
        return operations.divide(a, b);
    }
}
