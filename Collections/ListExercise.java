/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of all integers in the ArrayList is: " + sum);
    }

}
