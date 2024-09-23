package inheritance;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */


// Step 1: Create an Animal class
class Animal {
    String name;
    int age;
    
    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to make sound (will be overridden)
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

// Step 2: Create a Dog class that extends Animal
class Dog extends Animal {
    String breed;
    
    // Constructor to initialize name, age, and breed
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call the constructor of Animal
        this.breed = breed;
    }
    
    // Step 3: Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Step 4: Create a Cat class that extends Animal
class Cat extends Animal {
    int lives;
    
    // Constructor to initialize name, age, and lives
    public Cat(String name, int age, int lives) {
        super(name, age);
        this.lives = lives;
    }
    
    // Step 5: Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Step 6: Create a main class to demonstrate the behavior
public class Main {
    public static void main(String[] args) {
        // Step 7: Create an array of Animal objects and initialize it
        Animal[] animals = new Animal[4];
        animals[0] = new Animal("Lion", 5);
        animals[1] = new Dog("Bulldog", 3, "English Bulldog");
        animals[2] = new Cat("Whiskers", 2, 9);
        animals[3] = new Animal("Elephant", 10);
        
        // Loop through the array and print the name, age, and sound of each animal
        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.name + ", Age: " + animal.age);
            animal.makeSound();  // Call the makeSound method
        }
    }
}
