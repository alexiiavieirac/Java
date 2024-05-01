package projects.java.methods.test;
import projects.java.methods.domain.People;

public class PeopleTest01 {
    public static void main(String[] args) {
        People people = new People();

        people.setName("ByteCaster");
        people.setYears(18);

        System.out.println("Name: " + people.getName());
        System.out.println("Years: " + people.getYears());
    }
}
