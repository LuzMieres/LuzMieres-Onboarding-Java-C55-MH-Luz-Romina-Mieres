package day_3.pojo;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<Pet> pets;
    private final String name;
    private final String lastName;
    private final String identityCard;
    private final int age;
    private final double height;
    private final boolean married;

    public Person(String name, String lastName, String identityCard, int age, double height, boolean married) {
        this.name = name;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.pets = new ArrayList<>();
    }

    // Accessor methods
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

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }

    // toString method to print person information
    public void present() {
        System.out.println("Hello! My name is " + name + " " + lastName);
        System.out.println("I am " + age + " years old and I am " + height + " meters tall. ");
        if (married) {
            System.out.println("I am married.");
        } else {
            System.out.println("I am not married.");
        }
        System.out.println("My ID is " + identityCard);

        if (!pets.isEmpty()) {
            System.out.println("My pets are:");
            for (Pet pet : pets) {
                System.out.println("  -" + pet.getName() +
                        " is a " + pet.getTypeOfPet() +
                        " and he is " + pet.getAge() + " years old.");
            }
        } else {
            System.out.println("Does not have pets.");
        }
        System.out.println("-----------------");
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        pet.setOwner(this);
    }
}