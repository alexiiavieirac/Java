package projects.java.introduction;

public class BreakForExercise {
    public static void main(String[] args) {
        double totalValue = 20000;

        for (int split = 1; split <= totalValue; split++) {
            double valueSplit = totalValue / split;
            /* if (valueSplit >= 1000) {
                System.out.println("Split " + split + " U$" + valueSplit);
            } else {
                break;
            } */

            if (valueSplit < 1000) {
                break;
            }
            System.out.println("Split " + split + " U$" + valueSplit);
        }
    }
}
