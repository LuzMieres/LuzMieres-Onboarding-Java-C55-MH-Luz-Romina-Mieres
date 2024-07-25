package day_2;

import pojo.Person;

public class main {
    public static void main(String[] args) {
        //Exercise1
        String[] petsPerson1 = {"Rex", "Luna"};
        Person person1 = new Person("Juan", "Pérez", "123456789", 30, 1.75, false, petsPerson1);

        String[] petsPerson2 = {};
        Person person2 = new Person("Luz", "Mieres", "987654321", 27, 1.70, true, petsPerson2);

        // Utilizar el método presentarse
        person1.presentation();
        person2.presentation();


    }

}
