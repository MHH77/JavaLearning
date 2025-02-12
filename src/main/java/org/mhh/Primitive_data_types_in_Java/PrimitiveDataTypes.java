package org.mhh.Primitive_data_types_in_Java;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // 1. Primitive Data Types
        // Integer types
        byte byteValue = 127; // Max value of byte
        short shortValue = 32000;
        int intValue = 1_000_000; // Using underscores for readability
        long longValue = 9_223_372_036_854_775_807L; // Long values end with 'L'

        // Floating-point types
        float floatValue = 3.14f; // Float values end with 'f'
        double doubleValue = 3.14159265359;

        // Character type
        char charValue = 'A'; // Stores a single character
        char unicodeChar = '\u0041'; // Unicode representation of 'A'

        // Boolean type
        boolean isJavaFun = true; // Can only be true or false

        // 2. Overflow and Underflow
        byte overflowExample = 127;
        overflowExample++; // Overflow: wraps around to -128
        byte underflowExample = -128;
        underflowExample--; // Underflow: wraps around to 127

        // 3. Number Formats
        int octalValue = 010; // Octal representation (8 in decimal)
        int hexValue = 0x1A; // Hexadecimal representation (26 in decimal)
        int binaryValue = 0b1010; // Binary representation (10 in decimal)

        // 4. Type Casting
        // Implicit casting (smaller to larger type)
        int smallInt = 100;
        long largeLong = smallInt;

        // Explicit casting (larger to smaller type)
        long largeValue = 100000L;
        int smallerInt = (int) largeValue;

        // 5. Strings in Java
        String greeting = "Hello, World!";
        String name = "Alice";
        String message = greeting + " My name is " + name + ".";

        // 6. Variable Naming and Case Sensitivity
        int camelCaseVariable = 10; // Camel case for variables
        int PascalCaseVariable = 20; // Pascal case (not recommended for variables)
        final int CONSTANT_VARIABLE = 100; // Snake case for constants

        // Output all values
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Unicode Char Value: " + unicodeChar);
        System.out.println("Boolean Value: " + isJavaFun);

        System.out.println("\n=== Overflow and Underflow ===");
        System.out.println("Overflow Example: " + overflowExample);
        System.out.println("Underflow Example: " + underflowExample);

        System.out.println("\n=== Number Formats ===");
        System.out.println("Octal Value: " + octalValue);
        System.out.println("Hexadecimal Value: " + hexValue);
        System.out.println("Binary Value: " + binaryValue);

        System.out.println("\n=== Type Casting ===");
        System.out.println("Implicit Casting (int to long): " + largeLong);
        System.out.println("Explicit Casting (long to int): " + smallerInt);

        System.out.println("\n=== Strings in Java ===");
        System.out.println("Greeting: " + greeting);
        System.out.println("Message: " + message);

        System.out.println("\n=== Variable Naming and Case Sensitivity ===");
        System.out.println("Camel Case Variable: " + camelCaseVariable);
        System.out.println("Pascal Case Variable: " + PascalCaseVariable);
        System.out.println("Constant Variable: " + CONSTANT_VARIABLE);
    }
}
