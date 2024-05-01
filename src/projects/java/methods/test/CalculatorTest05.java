package projects.java.methods.test;
import projects.java.methods.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] sumAllNumbers = {1, 2, 3, 4, 5};

        calculator.sumArrays(sumAllNumbers);
        calculator.sumVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
