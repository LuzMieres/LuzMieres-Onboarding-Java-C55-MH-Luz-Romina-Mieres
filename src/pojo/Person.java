package pojo;

import java.util.Arrays;

public class Person {
    private String name;
    private String lastName;
    private String identityCard;
    private int age;
    private double heigth;
    private boolean married;
    private String[] pets;

    public Person(String name, String lastName, String identityCard, int age, double heigth, boolean married, String[] pets) {
        this.name = name;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.heigth = heigth;
        this.married = married;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public int getAge() {
        return age;
    }

    public double getHeigth() {
        return heigth;
    }

    public boolean isMarried() {
        return married;
    }

    public String[] getPets() {
        return pets;
    }

    public void presentation() {
        System.out.println("Hello! My name is " + name + " " + lastName);
        System.out.println("I am " + age + " years old and I am " + heigth + " meters tall. ");
        if (married) {
            System.out.println("I am married.");
        } else {
            System.out.println("I am not married.");
        }
        System.out.println("My ID is " + identityCard);
        if (pets == null || pets.length == 0) {
            System.out.println("I am not pets.");
        } else {
            System.out.println("My pets are called:");
            for (String pet : pets) {
                System.out.println("  -" + pet);
            }
            System.out.println("------------------------------");
        }

    }
}


