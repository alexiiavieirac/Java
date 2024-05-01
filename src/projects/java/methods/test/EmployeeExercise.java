package projects.java.methods.test;
import projects.java.methods.domain.Employee;

public class EmployeeExercise {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setNameEmployee("Mikaya");
        employee.setYearsEmployee(18);
        employee.setSalariesEmployee(new double[]{1423, 9541, 5624});

        employee.showScreen();

        System.out.println("Average Salaries: " + employee.getAverageSalary());
    }
}
