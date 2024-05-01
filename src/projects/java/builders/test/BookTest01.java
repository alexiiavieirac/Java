package projects.java.builders.test;
import projects.java.builders.domain.Book;

public class BookTest01 {
    public static void main(String[] args) {
        Book book = new Book("Deep Learning Book", "Artificial Intelligence", "Technology", 14);
        Book bookTwo = new Book();

        System.out.println("First Builder: ");
        book.showScreen();

        System.out.println("-------------------------");

        System.out.println("Second Builder: ");
        bookTwo.showScreen();
    }
}
