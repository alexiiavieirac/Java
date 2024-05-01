package projects.java.method_overloading.test;
import projects.java.method_overloading.domain.Books;

public class BooksTest01 {
    public static void main(String[] args) {
        Books books = new Books();

        books.init("Machine Learning Book", "Artificial Intelligence", 14);
        books.init("Machine Learning Book", "Artificial Intelligence", "Technology",14);

        books.showScreen();
    }
}
