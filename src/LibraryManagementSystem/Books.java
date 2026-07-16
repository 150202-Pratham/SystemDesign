package LibraryManagementSystem;

import java.util.UUID;

public class Books {
     UUID bookId;
     String bookName ;
     String bookAuthorName ;
     String bookGenre ;
     boolean bookAvailability = true;

    public Books(UUID bookId, String bookName, String bookGenre, String bookAuthorName ) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookGenre = bookGenre;
        this.bookAuthorName = bookAuthorName;

    }

    public UUID getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }


    public boolean isBookAvailable() {
        return bookAvailability;
    }

    public void setBookAvailable(boolean bookAvailability) {
        this.bookAvailability = bookAvailability;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", bookGenre='" + bookGenre + '\'' +
                ", bookAvailability=" + bookAvailability +
                '}';
    }
}
