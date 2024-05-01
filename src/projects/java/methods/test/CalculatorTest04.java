package projects.java.methods.test;
import projects.java.methods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int numberOne = 25;
        int numberTwo = 6;

        calculator.changeNumbers(numberOne, numberTwo);

        System.out.println("-------------------------------------");

        System.out.println("Change numbers: CalculatorTest04");
        System.out.println("Number one: " + numberOne);
        System.out.println("Number two: " + numberTwo);
    }
}
