package projects.java.methods.domain;

public class printStudent {
    public void printArgs(Student student) {
        System.out.println("---------------");

        System.out.println(student.name);
        System.out.println(student.years);
        System.out.println(student.sex);
    }
}
