package projects.java.objectorientation.test;
import projects.java.objectorientation.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();

        student2.nameSecond = "Íris";
        student2.yearsSecond = 15;
        student2.sexSecond = 'F';

        System.out.println("Student 1");

        System.out.println("Name: " + student.nameSecond);
        System.out.println("Years: " + student.yearsSecond);
        System.out.println("Sex: " + student.sexSecond);

        System.out.println("--------------------------------------");

        System.out.println("Student 2");

        System.out.println("Name: " + student2.nameSecond);
        System.out.println("Years: " + student2.yearsSecond);
        System.out.println("Sex: " + student2.sexSecond);
    }
}
