package day_3.pojo;

public class Pet {
    // Properties
    private String name;
    private PetType typeOfPet;
    private int age;
    private Person owner;

    // Parameterized constructor (without the owner property)
    public Pet(String name, PetType typeOfPet, int age) {
        this.name = name;
        this.typeOfPet = typeOfPet;
        this.age = age;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public PetType getTypeOfPet() {
        return typeOfPet;
    }

    public int getAge() {
        return age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // toString method to print pet information
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", typeOfPet=" + typeOfPet +
                ", age=" + age +
                ", owner=" + owner.getName() +
                '}';
    }
}