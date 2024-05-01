package projects.java.methods.test;
import projects.java.methods.domain.Student;
import projects.java.methods.domain.printStudent;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        printStudent showStudent = new printStudent();

        student1.name = "Iris";
        student1.years = 15;
        student1.sex = 'F';

        student2.name = "Alexia";
        student2.years = 18;
        student2.sex = 'F';

        showStudent.printArgs(student1);
        showStudent.printArgs(student2);
    }
}
