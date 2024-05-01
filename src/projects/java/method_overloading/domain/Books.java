package projects.java.method_overloading.domain;

public class Books {
    private String nameBook;
    private String typeBooks;
    private String bookGenre;
    private int episodesBooks;

    public void init(String nameBook, String typeBooks, int episodesBooks) {
        this.nameBook = nameBook;
        this.typeBooks = typeBooks;
        this.episodesBooks = episodesBooks;
    }

    public void init(String nameBook, String typeBooks, String bookGenre, int episodesBooks) {
        this.init(nameBook, typeBooks, episodesBooks);
        this.bookGenre = bookGenre;
    }

    public void showScreen() {
        System.out.println(this.nameBook);
        System.out.println(this.typeBooks);
        System.out.println(this.bookGenre);
        System.out.println(this.episodesBooks);
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setTypeBooks(String typeBooks) {
        this.typeBooks = typeBooks;
    }

    public void setEpisodesBooks(int episodesBooks) {
        this.episodesBooks = episodesBooks;
    }

    public String getTypeBooks() {
        return typeBooks;
    }

    public int getEpisodesBooks() {
        return episodesBooks;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getBookGenre() {
        return bookGenre;
    }
}
