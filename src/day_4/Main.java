package day_4;
import day_4.models.CalculatorWithMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorWithMenu calculatorWithMenu = new CalculatorWithMenu();

        int choice;
        do {
            calculatorWithMenu.displayMenu(); // Display calculator menu first
            calculatorWithMenu.executeOperation();

            System.out.print("Do you want to perform another operation? (1: Yes / 0: No): ");
            choice = calculatorWithMenu.scanner.nextInt();

            if (choice != 1 && choice != 0) {
                System.out.println("Invalid option. Please choose 1 to continue or 0 to exit.");
                System.out.print("Do you want to perform another operation? (1: Yes / 0: No): ");
                choice = calculatorWithMenu.scanner.nextInt();
            }

        } while (choice == 1);

        System.out.println("Exiting the calculator. See you later!");
        calculatorWithMenu.scanner.close();
    }
}