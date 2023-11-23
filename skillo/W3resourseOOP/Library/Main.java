package skillo.W3resourseOOP.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book bookOne = new Book("Les Miserables", "Victor Hugo");
        Book bookTwo = new Book("Tom Sawyer", "Twain Mark");

        library.addBook(bookOne);
        library.addBook(bookTwo);


        System.out.println("Books in the library: ");
        for (Book book: library.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
