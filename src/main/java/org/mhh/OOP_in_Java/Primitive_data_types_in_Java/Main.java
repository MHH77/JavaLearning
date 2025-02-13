package org.mhh.OOP_in_Java.Primitive_data_types_in_Java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", 39.99);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 45.50);
        System.out.println(book1.showBookDetail(book1));
        System.out.println(book2.showBookDetail(book2));
        Library library = new Library();
        library.setBooks(Arrays.asList(book1, book2));

        System.out.println(library.serachbook("Java Programming"));
        System.out.println(library.updatePrice("Java Programming",150.32));

    }
}
