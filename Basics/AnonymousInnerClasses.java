package innerClasses;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

 abstract class Animal2 {
    // Abstract method
    abstract void makeSound();
}

public class Main {
    public static void main(String[] args) {
        // Anonymous inner class implementation of Animal2
        Animal2 myAnimal = new Animal2() {
            @Override
            void makeSound() {
                System.out.println("This animal makes a sound.");
            }
        };

        // Calling the makeSound method
        myAnimal.makeSound();
    }
}
