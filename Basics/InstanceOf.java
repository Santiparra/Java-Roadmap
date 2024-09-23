package io.javabrains.javabasics;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        for (Object o : objects) {
            if (o instanceof Integer) {
                System.out.println(o + "is an integer");
            } else if (o instanceof String) {
                System.out.println(o + "is a string");
            } else if (o instanceof Boolean) {
                System.out.println(o + "is a boolean");
            } else if (o instanceof Double) {
                System.out.println(o + "is a double");
            }
        }


    }
}
