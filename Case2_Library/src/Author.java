public class Author {
    public String name;
    public String biography;

    public Author(String name, String biography){
        this.name = name;
        this.biography = biography;
    }

    public String getName(){
        return name;
    }

    public String getBio(){
        return biography;
    }
}
