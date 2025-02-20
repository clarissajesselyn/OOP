import java.util.ArrayList;

public class Library {
    public ArrayList<Book> libraryBook = new ArrayList<Book>();
    public void addBook(Book book){
        System.out.println("Book added to library: " + book.getTittle());
        libraryBook.add (book);
    }
    public void borrowBook(Borrower borrower, Book book){
        if (libraryBook.contains(book)){
            System.out.println(borrower.getName() + " borrowed: " + book.getTittle());
            borrower.borrowBook(book);
            libraryBook.remove(book);
        } else {
            System.out.println("The Book Not Found!!");
        }
    }
    public void returnBook(Borrower borrower, Book book){
        if (borrower.returnBook(book)){
            System.out.println(borrower.getName() + " returned: " + book.getTittle());
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
