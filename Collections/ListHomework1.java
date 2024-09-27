/*
Create a Java program that allows a user to perform various operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following operations:

1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program

The program should continue to display the menu and allow the user to perform operations until they choose to quit.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListHomework1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Add an element to the list");
            System.out.println("2. Remove an element from the list");
            System.out.println("3. Find the minimum element in the list");
            System.out.println("4. Find the maximum element in the list");
            System.out.println("5. Print the contents of the list");
            System.out.println("6. Quit the program");
            System.out.print("Choose an option (1-6): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add an element to the list
                    System.out.print("Enter an integer to add: ");
                    int addElement = scanner.nextInt();
                    list.add(addElement);
                    System.out.println(addElement + " has been added to the list.");
                    break;
                case 2:
                    // Remove an element from the list
                    System.out.print("Enter an integer to remove: ");
                    int removeElement = scanner.nextInt();
                    if (list.remove((Integer) removeElement)) {
                        System.out.println(removeElement + " has been removed from the list.");
                    } else {
                        System.out.println(removeElement + " is not in the list.");
                    }
                    break;
                case 3:
                    // Find the minimum element in the list
                    if (!list.isEmpty()) {
                        int min = Collections.min(list);
                        System.out.println("The minimum element is: " + min);
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 4:
                    // Find the maximum element in the list
                    if (!list.isEmpty()) {
                        int max = Collections.max(list);
                        System.out.println("The maximum element is: " + max);
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 5:
                    // Print the contents of the list
                    System.out.println("Contents of the list: " + list);
                    break;
                case 6:
                    // Quit the program
                    System.out.println("Quitting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 6.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
