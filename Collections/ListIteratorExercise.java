/*
Print the list in forward and reverse order using iterators only
*/

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExercise {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        System.out.println("Forward order:");
        ListIterator<String> forwardIterator = list.listIterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        System.out.println("\nReverse order:");
        ListIterator<String> reverseIterator = list.listIterator(list.size());
        while (reverseIterator.hasPrevious()) {
            System.out.println(reverseIterator.previous());
        }
    }
}
