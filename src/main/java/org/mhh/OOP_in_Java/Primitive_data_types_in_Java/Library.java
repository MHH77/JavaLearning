package org.mhh.OOP_in_Java.Primitive_data_types_in_Java;


import java.util.List;


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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
