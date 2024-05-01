package projects.java.builders.test;

import projects.java.builders.domain.Book;

public class BookTest02 {
    public static void main(String[] args) {
        Book book = new Book("Deep Learning Book", "Artificial Intelligence", "Technology", "Davis", 18);

        book.showScreen();
    }
}
