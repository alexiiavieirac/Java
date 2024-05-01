package projects.java.introduction;

public class RepetitionStructure {
    public static void main(String[] args) {
        // While, Do While and For
        int count = 0;
        int countTwo = 0;

        while (count != 10) {
            count += 1;
            System.out.println(count);
        }

        do {
            countTwo += 1;
            System.out.println(countTwo);
        } while (countTwo <= 10);

        for (int numberFor = 0; numberFor <= 5; numberFor++) {
            System.out.println(numberFor);
        }
    }
}
