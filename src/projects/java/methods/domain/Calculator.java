package projects.java.methods.domain;

public class Calculator {
    // CalculatorTest01
    public void sumNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractNumbers() {
        System.out.println(20 - 10);
    }

    // CalculatorTest02
    public void multiplyNumbers(int numberOne, int numberTwo) {
        System.out.println(numberOne * numberTwo);
    }

    // CalculatorTest03
    public double divideNumbers(double numberOne, double numberTwo) {
        if(numberTwo == 0) {
            return 0;
        } else {
            return numberOne / numberTwo;
        }
    }

    public void changeNumbers(int numberOne, int numberTwo) {
        numberOne = 5;
        numberTwo = 8;

        System.out.println("Change numbers: ");
        System.out.println("Number one: " + numberOne);
        System.out.println("Number two: " + numberTwo);
    }

    // CalculatorTest05
    public void sumArrays(int[] sumNumbers) {
        int sumAllNumbers = 0;
        for (int numbers : sumNumbers) {
            sumAllNumbers += numbers;
        }
        System.out.println(sumAllNumbers);
    }

    public void sumVarArgs(int... sumNumbers) {
        int sumAllNumbers = 0;
        for (int numbers : sumNumbers) {
            sumAllNumbers += numbers;
        }
        System.out.println(sumAllNumbers);
    }
}
