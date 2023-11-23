package skillo.W3resourseOOP.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book bookOne = new Book("To kill a Mockingbird", "Harper lee");
        Book bookTwo = new Book("Frankenstein", "Mary Shelley");
        Book bookThree = new Book("Moby-Dick", "Herman Melville");

        Book.addBook(bookOne);
        Book.addBook(bookTwo);
        Book.addBook(bookThree);

        ArrayList<Book> collectionOfBooks = Book.getCollectionOfBooks();

        System.out.println("The collection is: ");
        for (Book book : collectionOfBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthtor() + ", ISBN: " + book.getISBN());
        }

        Book.removeBook(bookTwo);

        System.out.println("\nAfter remove the collection now is: ");
        for (Book book : collectionOfBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthtor() + ", ISBN: " + book.getISBN());
        }
    }
}
