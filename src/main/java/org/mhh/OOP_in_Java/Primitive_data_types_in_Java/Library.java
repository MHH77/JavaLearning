package org.mhh.OOP_in_Java.Primitive_data_types_in_Java;

import lombok.Data;

import java.util.List;

@Data
public class Library {
    private List<Book> books;

    public Book serachbook(String title) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book updatePrice(String title, double price) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(title)) {
                book.setPrice(price);
                return book;
            }
        }
        return null;
    }


}
