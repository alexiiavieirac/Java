package projects.java.objectorientation.test;
import projects.java.objectorientation.domain.Teacher;

public class TeacherTest02 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher teacher2 = new Teacher();

        teacher2.teacherName2 = "Íris";
        teacher2.teacherYears2 = 15;
        teacher2.teacherSex2 = 'F';

        System.out.println("Teacher 1");

        System.out.println("Teacher name: " + teacher.teacherName);
        System.out.println("Teacher years: " + teacher.teacherYears);
        System.out.println("Teacher sex: " + teacher.teacherSex);

        System.out.println("------------------------------------------");

        System.out.println("Teacher 2");

        System.out.println("Teacher name: " + teacher2.teacherName2);
        System.out.println("Teacher years: " + teacher2.teacherYears2);
        System.out.println("Teacher sex: " + teacher2.teacherSex2);
    }
}
