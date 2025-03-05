import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowBooks = new ArrayList<Book>();
    
    public Borrower(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void borrowBook(Book book){
        borrowBooks.add(book);
        System.out.println(name + " borrowed: " + book.getTittle());
    }
    public boolean returnBook(Book book){
        if (borrowBooks.contains(book)){
            borrowBooks.remove(book);
            System.out.println(name + " returned: " + book.getTittle());
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
