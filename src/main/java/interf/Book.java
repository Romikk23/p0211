package interf;

public class Book implements MyInterface {
    private String title;
    private AuthorInterface author;

    public Book(String title, AuthorInterface author) {
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println(title);
        System.out.println(author.getName() + " " + author.getYear());
    }
}
