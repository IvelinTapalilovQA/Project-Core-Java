package skillo.W3resourseOOP.Book;

import java.util.ArrayList;
import java.util.Random;

public class Book {

    private String title;
    private String author;
    private int ISBN;
    private static ArrayList<Book> collectionOfBooks = new ArrayList<>();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        setISBN();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthtor() {
        return author;
    }

    public void setAuthtor(String authtor) {
        this.author = authtor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN() {
        Random number = new Random();
        this.ISBN = number.nextInt(10000, 99999);
    }

    public static ArrayList<Book> getCollectionOfBooks() {
        return collectionOfBooks;
    }

    public static void addBook(Book book){
        collectionOfBooks.add(book);
    }
    public static void removeBook(Book book){
        collectionOfBooks.remove(book);
    }

}
