package Day7.Task;
import java.util.*;
public class LibraryManagement {
    public static void main(String[] args) {

        Library lib = new Library();
        Book b1 = new Book(1, "Java Basics", "James Gosling");
        Book b2 = new Book(2, "OOP Concepts", "Bjarne Stroustrup");
        IssuedBook ib1 = new IssuedBook(3, "Data Structures", "Mark Allen", "Criston");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(ib1);
        IO.println("\nLibrary Books:");
        lib.displayAllBooks();
        IO.println("\nIssued Book Details:");
        ib1.displayIssuedBook();
    }
}
class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void displayBook() {
         IO.println("Book ID: " + bookId);
         IO.println("Title: " + title);
         IO.println("Author: " + author);
    }
}
class IssuedBook extends Book {
    String issuedTo;

    IssuedBook(int bookId, String title, String author, String issuedTo) {
        super(bookId, title, author);
        this.issuedTo = issuedTo;
    }

    void displayIssuedBook() {
        super.displayBook();
        System.out.println("Issued To: " + issuedTo);
    }
}
class Library {
    Book[] books = new Book[5];
    int count = 0;

    void addBook(Book b) {
        if (count < books.length) {
            books[count] = b;
            count++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full!");
        }
    }

    void displayAllBooks() {
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
            System.out.println("----");
        }
    }
}
