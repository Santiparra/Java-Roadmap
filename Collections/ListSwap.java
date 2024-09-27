/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

import java.util.ArrayList;
import java.util.List;

public class ListSwap {

    public static void main(String[] args) {
        // Example usage of the swap method with a mutable list
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5)); // Use ArrayList for mutability
        swap(integerList, 1, 3);
        System.out.println("Swapped List: " + integerList);

        // Example with a mutable list of strings
        List<String> stringList = new ArrayList<>(List.of("A", "B", "C", "D"));
        swap(stringList, 0, 2);
        System.out.println("Swapped String List: " + stringList);
    }

    public static <T> void swap(List<T> list, int pos1, int pos2) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two elements.");
        }

        if (pos1 < 0 || pos1 >= list.size() || pos2 < 0 || pos2 >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid positions.");
        }

        // Swap the elements
        T temp = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, temp);
    }
}

