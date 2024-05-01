package projects.java.methods.domain;

public class Employee {
    // I need create a class with attributes: name, years and three salaries
    // I need create two methods: show on screen and show average salaries

    private String nameEmployee;
    private int yearsEmployee;
    private double[] salariesEmployee;
    private double averageSalary;

    public void showScreen() {
        System.out.println(this.nameEmployee);
        System.out.println(this.yearsEmployee);
        if (salariesEmployee == null) {
            System.out.println("Salaries: No data");
        } else {
            System.out.println("Salaries: ");
            for (double salary : salariesEmployee) {
                System.out.println(salary);
            }
        }
    }

    public void calculateAverageSalaries() {
        if (salariesEmployee != null) {
            double totalSalary = 0;
            for (double salary : salariesEmployee) {
                totalSalary += salary;
            }
            averageSalary = totalSalary / salariesEmployee.length;
        }
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public void setYearsEmployee(int yearsEmployee) {
        this.yearsEmployee = yearsEmployee;
    }

    public void setSalariesEmployee(double[] salariesEmployee) {
        this.salariesEmployee = salariesEmployee;
        calculateAverageSalaries();
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public int getYearsEmployee() {
        return yearsEmployee;
    }

    public double[] getSalariesEmployee() {
        return salariesEmployee;
    }

    public double getAverageSalary() {
        return averageSalary;
    }
}
