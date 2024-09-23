package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
            int i = 10;
        // Step 2: Convert primitive variables to wrapper objects
            Integer intWrapper = new Integer(i);

        //AUTOBOXING
            Integer j = 11;

        // Step 3: Print the values of the wrapper objects
            System.out.println(i)
        // Step 4: Convert wrapper objects back to primitive variables
            System.out.println(intWrapper);
            System.out.println(j);
        // Step 5: Print the values of the primitive variables

    }
}
