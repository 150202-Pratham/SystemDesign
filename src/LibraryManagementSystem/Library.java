package LibraryManagementSystem;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Library {
    List<Books> books ;

    public Library() {
        books = new ArrayList<>() ;

    }

    public void addBook( Books book){

        books.add(book) ;

    }
    public void removeBook(Books book){
        books.remove(book) ;


    }

    public Books findBook(UUID bookId){

        if(bookId == null){
            throw new NullPointerException("Book Id is null") ;
        }
        else {
            for(Books book : books){
                if(book.getBookId().equals(bookId)){
                    return book ;


                }
            }
        }
        return null;

    }
    public void getBooks(){
        for(int i = 0 ; i<books.size() ; i++){
            System.out.println(books.get(i).toString()) ;

        }

    }
    public Object issueBook(String bookName , String authorName){
        if(bookName == null || authorName == null){
            throw new NullPointerException("Book Name or Author Name is not available") ;
        }
        else{
            for(int i = 0 ; i<books.size() ; i++){
                if(books.get(i).getBookName().equals(bookName)
                        && books.get(i).getBookAuthorName().equals( authorName )  && books.get(i).isBookAvailable()) {
                    books.get(i).setBookAvailable(false);

                    return books.get(i) ;

                }
            }
        }
        return "No Book Found";

    }

    public String receiveBook(String bookName , UUID  bookID){
        if(bookID== null){
            throw new NullPointerException("Book Id is null") ;
        }
        for(int i = 0 ; i<books.size() ; i++){
            if(books.get(i).getBookId().equals(bookID) && books.get(i).getBookName().equals(bookName)){
                books.get(i).setBookAvailable(true);

                return  "Found Returned Successfully" ;

            }
        }

        return "Not a Required Book to return" ;
    }

}
