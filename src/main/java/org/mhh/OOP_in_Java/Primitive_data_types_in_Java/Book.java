package org.mhh.OOP_in_Java.Primitive_data_types_in_Java;

public class Book {
    private Long id;
    private String name;
    private String author;
    private double price;
    private static long bookCount;

    public Book() {
    }

    public Book(String name, String author, double price) {
        this.id = bookCount++;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static long getBookCount() {
        return bookCount;
    }

    public static void setBookCount(long bookCount) {
        Book.bookCount = bookCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String showBookDetail(Book book) {
        return book.toString();
    }

}
