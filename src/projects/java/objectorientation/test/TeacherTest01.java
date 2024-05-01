package projects.java.objectorientation.test;
import projects.java.objectorientation.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        System.out.println("Teacher 1");

        System.out.println("Teacher name: " + teacher.teacherName);
        System.out.println("Teacher years: " + teacher.teacherYears);
        System.out.println("Teacher sex: " + teacher.teacherSex);

        // We access the memory space on our computer that this object is allocated.
        System.out.println(teacher);
    }
}
