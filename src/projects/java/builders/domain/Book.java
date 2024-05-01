package projects.java.builders.domain;

public class Book {
    private String nameBook;
    private String typeBooks;
    private String bookGenre;
    private String authorBook;
    private int episodesBooks;

    public Book(String nameBook, String typeBooks, String bookGenre, int episodesBooks) {
        this();
        this.nameBook = nameBook;
        this.typeBooks = typeBooks;
        this.episodesBooks = episodesBooks;
        this.bookGenre = bookGenre;
    }

    public Book(String nameBook, String typeBooks, String bookGenre, String authorBook, int episodesBooks) {
        this(nameBook, typeBooks, bookGenre, episodesBooks); 
        this.authorBook = authorBook;
    }

    public Book() {
        System.out.println("Author: Davis");
    }

    public void showScreen() {
        System.out.println(this.nameBook);
        System.out.println(this.typeBooks);
        System.out.println(this.bookGenre);
        System.out.println(this.episodesBooks);
        System.out.println(this.authorBook);
    }
}
