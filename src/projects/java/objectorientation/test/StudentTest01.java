package projects.java.objectorientation.test;
import projects.java.objectorientation.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Aléxia";
        student.years = 18;
        student.sex = 'F';

        System.out.println("Name:" + student.name);
        System.out.println("Years: " + student.years);
        System.out.println("Sex: " + student.sex);

        // We access the memory space on our computer that this object is allocated.
        System.out.println(student);
    }
}
