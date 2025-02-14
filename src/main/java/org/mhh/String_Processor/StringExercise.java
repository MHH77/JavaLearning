package org.mhh.String_Processor;

import java.util.Scanner;

public class StringExercise {

    private void checkEmailAndName(String name, String email) {
        if (name.isEmpty() || name.isBlank()) {
            System.out.println("name is empty");
        }
        if (email.isEmpty() || email.isBlank()) {
            System.out.println("email is empty");
        }
    }

    private void uppercaseName(String name) {
        System.out.println("name is upperCase => " + name.toUpperCase());
    }

    private void lengthOfNameAndEmail(String name, String email) {
        System.out.println("Length of email => " + email.length());
        System.out.println("Length of name => " + name.length());
    }

    private void descriptionHasJavaWord(String description) {
        System.out.println(description.contains("java") ? "description has java word" : "description has not java word");

    }

    private void nameIsInPool(String name) {
        if (name.intern() == name) {
            System.out.println("Name is in the string pool.");
        } else {
            System.out.println("Name is not in the string pool.");
        }

    }


    public static void main(String[] args) {
        StringExercise stringExercise = new StringExercise();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.next().trim();
        System.out.print("Enter your email address : ");
        String email = scanner.next().trim();
        System.out.print("Enter your description :  ");
        String description = scanner.next().trim();
        stringExercise.checkEmailAndName(name, email);
        stringExercise.uppercaseName(name);
        stringExercise.lengthOfNameAndEmail(name, email);
        stringExercise.descriptionHasJavaWord(description);
        stringExercise.nameIsInPool(name);
    }
}
