package staticKeyword;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

 public class Rectangle {

    // Instance variables
    private double width;
    private double height;

    // Static variable to track the number of Rectangle objects
    private static int numOfRectangles = 0;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        numOfRectangles++; // Increment the count of rectangles created
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Static method to return the number of rectangles created
    public static int getNumOfRectangles() {
        return numOfRectangles;
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        // Creating Rectangle objects
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(7, 3);
        Rectangle rect3 = new Rectangle(6, 4);

        // Printing the area and perimeter of each rectangle
        System.out.println("Rectangle 1 Area: " + rect1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + rect1.getPerimeter());

        System.out.println("Rectangle 2 Area: " + rect2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + rect2.getPerimeter());

        System.out.println("Rectangle 3 Area: " + rect3.getArea());
        System.out.println("Rectangle 3 Perimeter: " + rect3.getPerimeter());

        // Printing the total number of rectangles created
        System.out.println("Total number of rectangles created: " + Rectangle.getNumOfRectangles());
    }
}

