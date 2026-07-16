package LibraryManagementSystem;

import java.awt.print.Book;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Librarian librarian = new Librarian(library);

        Books cleanCode = new Books(
                UUID.randomUUID(),
                "Clean Code",
                "Computer Science and Software Engineering",
                "Robert Martin"
        );

        librarian.addBook(cleanCode);

        library.issueBook("Clean Code", "Robert Martin");

        System.out.println(
                library.receiveBook(
                        "Clean Code",
                        cleanCode.getBookId()
                )
        );
    }
}
