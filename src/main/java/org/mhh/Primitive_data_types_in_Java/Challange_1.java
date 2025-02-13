package org.mhh.Primitive_data_types_in_Java;

import java.util.Scanner;

public class Challange_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.next();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.print("Enter your height :");
        float height = scanner.nextFloat();
        System.out.print("Is active ?");
        boolean isActive = scanner.nextBoolean();

        System.out.println("=== Welcome," + name + "! ===");
        System.out.println("Your details:" +
                "\n- Age: " + age + " years" +
                "\n- Height: " + height + " cm" +
                "\n- Active: " + isActive + "\n");

        boolean isOverflow = age + 200 > Integer.MAX_VALUE ? true : false;
        int ageIn10Years = age + 10;
        System.out.println("=== Calculations ===\n" +
                "- Your age in 10 years: " + age + "\n" +
                "- Your height in meters: " + height / 100 + "m\n" +
                "- Will your age overflow if 200 years are added? " + isOverflow + "\n");

        int formatUnderScore = (int) (height * 1000);
        System.out.println("=== Number Formats ===\n" +
                "- Age in hexadecimal:0x" + Integer.toHexString(age) + "\n" +
                "- Age in binary: 0b" + Integer.toBinaryString(age) + "\n" +
                "- Height (formatted): "+formatUnderScore+"\n");


        System.out.println("=== Type Casting ===\n" +
                "- Age as byte: "+(byte)age+"\n" +
                "- Height as double: "+(double) height+"\n");


        String message = "Thank you for using the program, " + name + "!";
        System.out.println("\n" + message);

    }


}
