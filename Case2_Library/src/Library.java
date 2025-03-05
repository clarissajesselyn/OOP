import java.util.ArrayList;

public class Library {
    private ArrayList<Book> libraryBook = new ArrayList<Book>();
    public void addBook(Book book){
        System.out.println("Book added to library: " + book.getTittle());
        libraryBook.add (book);
    }
    public void borrowBook(Borrower borrower, Book book){
        if (libraryBook.contains(book)){
            borrower.borrowBook(book);
            libraryBook.remove(book);
        } else {
            System.out.println("The Book Not Found!!");
        }
    }
    public void returnBook(Borrower borrower, Book book){
        if (borrower.returnBook(book)){
            libraryBook.add (book);
        } else {
            System.out.println("Borrower has no such book!");
        }
    }
    public void displayLibraryBooks(){
        System.out.println("Books in Library:");
        for (Book libBook:libraryBook){
            libBook.displayBook();
        }
    }
}
