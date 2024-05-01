package projects.java.methods.test;
import projects.java.methods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator calculator1 = new Calculator();

        calculator.sumNumbers();
        calculator1.subtractNumbers();
    }
}
