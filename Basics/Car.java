package classesAndObjects;

/*
1.  Create a class called `Car` with member variables for the make, model, and year of the car.
2.  Create a constructor method for the `Car` class that initializes the member variables.
3.  Create getter methods for the make, model, and year.
4.  Create a `toString` method that returns a string representation of the car in the form "year make model".
5.  In the `main` method of this class, create a `Car` object with a make, model, and year of your choice.
6.  Use the member variables and methods of the `Car` class to print the make, model, and year of the car.
7.  The expected output of the program is:

```
Make: Toyota
Model: Camry
Year: 2020
Details: 2020 Toyota Camry
```

 */

 public class Car {
    // Member variables
    private String make;
    private String model;
    private int year;

    // Constructor to initialize the member variables
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods for make, model, and year
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // toString method to return the string representation of the car
    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }

    // Main method to create a Car object and print its details
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", 2020);

        // Print the make, model, and year using getter methods
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        // Print the details using the toString method
        System.out.println("Details: " + myCar.toString());
    }
}
