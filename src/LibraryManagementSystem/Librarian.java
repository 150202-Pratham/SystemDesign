package LibraryManagementSystem;

public class Librarian {

    private  final Library library ;

    public Librarian(Library library) {
        this.library = library;
    }

    public void addBook(Books book){
        library.addBook(book);
    }


}
