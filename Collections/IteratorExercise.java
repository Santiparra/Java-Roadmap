import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
Write code that calls the getFruits method and then iterates over the collection, printing each element to console
 */

public class IteratorExercise {
    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits();

        for (String next : fruits) {
            System.out.println("fruit = " + next);
        }
//        Iterator<String> iterator = fruits.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println("fruit = " +next );
//        }

    }

}


class FruitSupplier {
    public Collection<String> getFruits() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

}