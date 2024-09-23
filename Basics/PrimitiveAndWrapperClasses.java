package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
            int i = 10;
        // Step 2: Convert primitive variables to wrapper objects
            Integer iObj = i;

        // Step 3: Print the values of the wrapper objects
            System.out.println(iObj);
        // Step 4: Convert wrapper objects back to primitive variables
            i = iObj;
        // Step 5: Print the values of the primitive variables
            System.out.println(i);
    }
}
