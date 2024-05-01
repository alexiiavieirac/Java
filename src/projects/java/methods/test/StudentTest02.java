package projects.java.methods.test;
import projects.java.methods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Mikaya";
        student1.years = 16;
        student1.sex = 'F';

        student2.name = "Persona";
        student2.years = 17;
        student2.sex = 'M';

        student1.showScreen();
        student2.showScreen();
    }
}
