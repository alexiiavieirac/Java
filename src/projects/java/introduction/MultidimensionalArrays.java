package projects.java.introduction;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 mouth
        // 31, 28, 30, 31 days
        int[][] days = new int[3][3];
        days[0][0] = 0;
        days[0][1] = 1;
        days[0][2] = 2;

        days[1][0] = 3;
        days[1][1] = 4;
        days[1][2] = 5;

        days[2][0] = 6;
        days[2][1] = 7;
        days[2][2] = 8;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        System.out.println("------------------------------");

        // Use foreach:
        for (int [] arrayBase : days) {
            for (int numbers : arrayBase) {
                System.out.println(numbers);
            }
        }
    }
}
