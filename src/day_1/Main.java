package day_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Exercise1
        String name = "Luz";
        String lastName = "Mieres";
        int age = 27;
        System.out.println(name + lastName + age);

        //Exercise2
        greeting(name, lastName, age);

        //Exercise3
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the thirth number:");
        int number3 = scanner.nextInt();
        System.out.println("The bigger number is: " + biggerNumber(number1, number2, number3));

        //Exercise4
        System.out.println("Enter a number: ");
        int numberEvenOdd = scanner.nextInt();
        if (evenOdd(numberEvenOdd)){
            System.out.println("The number" + numberEvenOdd + " is even");
        }else {
            System.out.println("The number" + numberEvenOdd + " is odd");
        }

//        //Exercise5
        System.out.println("Enter the first string of characters: ");
        String strin1 = scanner.nextLine();

        System.out.println("Enter the second string of characters: ");
        String string2 = scanner.nextLine();
        if (compareStrings(strin1, string2)){
            System.out.println("The character strings are the same. ");
        }else{
            System.out.println("The character strings are different. ");
        }

        //Exercise6
        System.out.println("Enter a number to check if it is prime or not: ");
        int numberPrime = scanner.nextInt();

        if (isPrime(numberPrime)) {
            System.out.println(numberPrime + " It is a prime number.");
        } else {
            System.out.println(numberPrime + " It is not a prime number.");
        }

        //Exercise7
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (sumOddNumbers(numbers) > 0) {
            System.out.println("The sum of the odd numbers is: " + sumOddNumbers(numbers));
        } else {
            System.out.println("There are no odd numbers in the array.");
        }

        //Exercise8
        int[][] numbers2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        printEvenAndSumOfPrimes(numbers2);

        //Exercise9
        displayMenu();

        //Exercise10
        startCalculator();

        //Exercise11
        displayBoleraMenu();

        //Exercise12
        manageBoleraEntry();
    }


    //Exercise2
    public static void greeting (String fname, String flastName ,int age){
        System.out.println("Hi I am " + fname + " " + flastName + " and I am " + age + " years old.");
    }
    //Exercise3
    public static int biggerNumber(int number1, int number2, int number3){
        return Math.max(Math.max(number1, number2), number3);
    }
    //Exercise4
    public static boolean evenOdd(int number){
        if (number %2 == 0) {
            return true;
        }
        return false;
    }
    //Exercise5
    public static boolean compareStrings(String string1, String string2){
        if (string1.equalsIgnoreCase(string2)){
            return true;
        }
        return false;
    }
    //Exercise 6
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    //Exercise 7
    public static int sumOddNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }
        return numbers.length > 0 ? sum : 0;
    }
    //Exercise 8
    public static void printEvenAndSumOfPrimes(int[][] numbers2) {
        int sumOfPrimes = 0;

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                if (numbers2[i][j] % 2 == 0) {
                    System.out.print("The even number is: " + numbers2[i] + " ");
                } else if (numbers2[i][j] > 1) {
                    sumOfPrimes += numbers2[i][j];
                }
            }
        }

        System.out.println("\nSum of prime numbers: " + sumOfPrimes);
    }
    //Exercise 9
    public static void displayMenu() {
        System.out.println("\nCalculator Menu");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }
    //Exercise10
    public static void startCalculator() {
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            displayMenu();
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    performOperation("+");
                    break;
                case 2:
                    performOperation("-");
                    break;
                case 3:
                    performOperation("*");
                    break;
                case 4:
                    performOperation("/");
                    break;
                case 0:
                    System.out.println("Exiting the calculator. See you later!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a correct option.");
            }

        } while (option != 0);

    }
    public static void performOperation(String operator) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Result of " + num1 + " " + operator + " " + num2 + " = " + result);
    }
    //Exercise11
    public static void displayBoleraMenu() {
        System.out.println("\nBolera Menu");
        System.out.println("Choose an option: ");
        System.out.println("1. Data Entry");
        System.out.println("2. Available Capacity");
        System.out.println("3. Collected Money");
        System.out.println("4. Log out from the system");
    }

    //Exercise12
    public static void manageBoleraEntry() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            displayBoleraMenu();
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    enterData();
                    break;
                case 2:
                    displayAvailableCapacity();
                    break;
                case 3:
                    displayCollectedRevenue();
                    break;
                case 4:
                    System.out.println("Closing the system's session. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }

        } while (option != 4);

        scanner.close();
    }
    public static void enterData() {
        Scanner scanner = new Scanner(System.in);

        if (currentCapacity < maximumCapacity) {
            System.out.print("Enter participant's name: ");
            String name = scanner.next();

            System.out.print("Enter participant's age: ");
            int age = scanner.nextInt();

            if (age >= 21) {
                System.out.print("Enter participant's DNI: ");
                String dni = scanner.next();

                System.out.print("Do you have a VIP pass? (Yes/No): ");
                String hasVIPPass = scanner.next().toLowerCase();

                double ticketPrice = 1500.0;
                if (hasVIPPass.equals("yes")) {
                    System.out.println("Welcome " + name + "! Your ticket is free (VIP).");
                } else {
                    System.out.print("Do you have a discounted pass? (Yes/No): ");
                    String hasDiscountedPass = scanner.next().toLowerCase();

                    if (hasDiscountedPass.equals("yes")) {
                        System.out.print("Do you want to buy a normal or VIP ticket? (Normal/VIP): ");
                        String ticketType = scanner.next().toLowerCase();

                        if (ticketType.equals("vip")) {
                            ticketPrice = 2000.0 / 2; // VIP ticket with 50% discount
                        } else {
                            ticketPrice /= 2; // Normal ticket with 50% discount
                        }

                        System.out.println("Welcome " + name + "! The cost of your ticket is: $" + ticketPrice);
                        collectedRevenue += ticketPrice;
                    } else {
                        System.out.print("Do you want to buy a normal or VIP ticket? (Normal/VIP): ");
                        String ticketType = scanner.next().toLowerCase();

                        if (ticketType.equals("vip")) {
                            ticketPrice = 2000.0;
                        }

                        System.out.println("Welcome " + name + "! The cost of your ticket is: $" + ticketPrice);
                        collectedRevenue += ticketPrice;
                    }
                }

                currentCapacity++;
            } else {
                System.out.println("Sorry, only people over 21 are allowed to enter.");
            }
        } else {
            System.out.println("Sorry, the bowling alley has reached its maximum capacity.");
        }
    }
    public static void displayAvailableCapacity() {
        System.out.println("Current capacity: " + currentCapacity + " people");
        System.out.println("Available capacity: " + (maximumCapacity - currentCapacity) + " people");
    }

    public static void displayCollectedRevenue() {
        System.out.println("Revenue collected so far: $" + collectedRevenue);
    }

    public static int maximumCapacity = 500;
    public static int currentCapacity = 0;
    public static double collectedRevenue = 0.0;

}



