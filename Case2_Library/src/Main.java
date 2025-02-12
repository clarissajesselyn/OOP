import java.util.*;
public class Main {

    public Main(){
        Author author1 = new Author("James Gosling", "Creator of the Java programming language.");
        Author author2 = new Author("Robert C. Martin", "Known for his works on software craftsmanship.");

        Book book1 = new Book("Java Programming", "123456789", author1);
        Book book2 = new Book("Clean Code", "987654321", author2);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        Borrower borrower = new Borrower("Alice");

        library.borrowBook(borrower, book1);
        library.borrowBook(borrower, book2);

        borrower.displayBorrowedBooks();

        library.returnBook(borrower, book1);

        borrower.displayBorrowedBooks();
        
        library.displayLibraryBooks();
    }
    public static void main(String[] args) throws Exception {
        new Main();
    }

    public class Author{
        String name;
        String biography;

        public Author(String name, String biography){
            this.name = name;
            this.biography = biography;
        }

    }

    public class Book{
        String title;
        String isbn;
        Author author;
        public Book(String title, String isbn, Author author){
            this.title = title;
            this.isbn = isbn;
            this.author = author;
        }
    }

    public class Library{
        ArrayList<Book> libraryBook = new ArrayList<Book>();
        public void addBook(Book book){
            System.out.println("Book added to library: " + book.title);
            libraryBook.add (book);
        }
        public void borrowBook(Borrower borrower, Book book){
            if (libraryBook.contains(book)){
                System.out.println(borrower.name + " borrowed: " + book.title);
                borrower.borrowBook(book);
                libraryBook.remove(book);
            } else {
                System.out.println("The Book Not Found!!");
            }
        }
        public void returnBook(Borrower borrower, Book book){
            if (borrower.returnBook(book)){
                System.out.println(borrower.name + " returned: " + book.title);
                libraryBook.add (book);
            } else {
                System.out.println("Borrower has no such book!");
            }
        }
        public void displayLibraryBooks(){
            System.out.println("Books in Library:");
            for (Book libBook:libraryBook){
                System.out.println("Title: " + libBook.title);
                System.out.println("ISBN: " + libBook.isbn);
                System.out.println("Author: " + libBook.author.name);
                System.out.println("Biography: " + libBook.author.biography);
                System.out.println("------------------------");
            }
            for(Book libBook:libraryBook){
                
            }
        }
    }

    public class Borrower{
        String name;
        ArrayList<Book> borrowBooks = new ArrayList<Book>();
        public Borrower(String name){
            this.name = name;
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
            System.out.println(this.name+"'s Borrowed Books:");
            for (Book borrowedBook:borrowBooks){
                System.out.println("Title: " + borrowedBook.title);
                System.out.println("ISBN: " + borrowedBook.isbn);
                System.out.println("Author: " + borrowedBook.author.name);
                System.out.println("Biography: " + borrowedBook.author.biography);
                System.out.println("------------------------");
            }
        }
    }
}
