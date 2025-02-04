// Interface defining basic animal behavior
interface Animal {
    void makeSound(); // Abstract method
}

// Abstract class implementing the interface and adding extra functionality
abstract class Mammal implements Animal {
    int age;

    // Constructor
    Mammal(int age) {
        this.age = age;
    }

    // Abstract method - must be implemented by subclasses
    abstract void eat();

    // Concrete method with implementation
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Concrete class extending the abstract class
class Dog extends Mammal {
    String breed;

    // Constructor
    Dog(int age, String breed) {
        super(age);
        this.breed = breed;
    }

    // Implementing abstract method from Mammal
    @Override
    void eat() {
        System.out.println("Dog is eating...");
    }

    // Implementing method from the Animal interface
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Additional method specific to Dog
    void fetch() {
        System.out.println("Fetching the ball...");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create a Dog object (Concrete class)
        Dog myDog = new Dog(3, "Labrador");

        // Calling methods
        System.out.println("Dog Age: " + myDog.age);
        System.out.println("Dog Breed: " + myDog.breed);
        myDog.makeSound(); // Interface method
        myDog.eat(); // Abstract class method
        myDog.sleep(); // Concrete method from abstract class
        myDog.fetch(); // Dog-specific method
    }
}
