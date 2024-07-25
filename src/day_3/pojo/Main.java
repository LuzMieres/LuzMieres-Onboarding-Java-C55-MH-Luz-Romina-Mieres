package day_3.pojo;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of the Person class
        Person person1 = new Person("Juan", "Pérez", "123456789", 30, 1.75, false);
        Person person2 = new Person("Luz", "Mieres", "987654321", 27, 1.70, true);

        // Create instances of Pets
        Pet pet1 = new Pet("Rex", PetType.DOG, 3);
        Pet pet2 = new Pet("Luna", PetType.CAT, 2);
        Pet pet3 = new Pet("COCO", PetType.BIRD, 1);
        Pet pet4 = new Pet("Kira", PetType.FISH, 4);

        // Set the relationship between person1 and their two pets
        person1.addPet(pet1);
        person1.addPet(pet2);
        person2.addPet(pet3);
        person2.addPet(pet4);

        person1.present();
        person2.present();
    }


}