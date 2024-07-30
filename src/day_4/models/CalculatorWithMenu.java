package day_4.models;

import java.util.Scanner;

import day_4.models.Calculator;
import day_4.models.*;
// Clase que implementa el menú de la calculadora
public class CalculatorWithMenu implements day_4.models.CalculatorMenu {
    private Calculator calculator;
    public Scanner scanner;

    public CalculatorWithMenu() {
        this.calculator = new Calculator();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void displayMenu() {
        System.out.println("\nMenú de la Calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
    }

    @Override
    public void executeOperation() {
        System.out.print("Seleccione una opción: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performOperation("sumar", "+");
                break;
            case 2:
                performOperation("restar", "-");
                break;
            case 3:
                performOperation("multiplicar", "*");
                break;
            case 4:
                performOperation("dividir", "/");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción correcta.");
        }
    }
    private void performOperation(String operation, String symbol) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        if (operation.equals("dividir") && num2 == 0) {
            System.out.println("Error: No se puede dividir por 0.");
        } else {
            System.out.println("Resultado de " + num1 + " " + symbol + " " + num2 + " = " +
                    (operation.equals("dividir") ? calculator.divide(num1, num2) : performBasicOperation(operation, num1, num2)));
        }
    }

    private double performBasicOperation(String operation, double num1, double num2) {
        switch (operation) {
            case "sumar":
                return calculator.sum(num1, num2);
            case "restar":
                return calculator.subtract(num1, num2);
            case "multiplicar":
                return calculator.multiply(num1, num2);
            default:
                return 0;
        }
    }
}