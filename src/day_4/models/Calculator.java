package day_4.models;

import day_4.models.CalculatorOperations;

// Clase que implementa las operaciones de la calculadora
public class Calculator implements CalculatorOperations {
    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN; // Not a Number
        }
    }
}