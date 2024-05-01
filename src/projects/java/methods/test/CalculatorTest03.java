package projects.java.methods.test;
import projects.java.methods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.divideNumbers(20, 2);

        System.out.println(result);
    }
}
