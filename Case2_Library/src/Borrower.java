import java.util.ArrayList;

public class Borrower {
    public String name;
    public ArrayList<Book> borrowBooks = new ArrayList<Book>();
    
    public Borrower(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void borrowBook(Book book){
        borrowBooks.add(book);
    }
    public boolean returnBook(Book book){
        if (borrowBooks.contains(book)){
            borrowBooks.remove(book);
            return true;
        }
        return false;
    }

    public void displayBorrowedBooks(){
        System.out.println(name + "'s Borrowed Books:");
        for (Book borrowedBook:borrowBooks){
            borrowedBook.displayBook();
        }
    }
}
