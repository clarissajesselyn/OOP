public class Book{
    public String title;
    public String isbn;
    public Author author;
    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public void displayBook(){
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author.name);
        System.out.println("Biography: " + author.biography);
        System.out.println("------------------------");
    }
}