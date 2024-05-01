package projects.java.introduction;

public class TwoJava {

    public static void main(String[] args) {
        // write your code here
        boolean weekend = true;
        boolean makingSun = false;
        // boolean goToTheBeach = weekend && makingSun;
        // System.out.println("Are we going to the beach at the weekend? " + goToTheBeach);

        String mesage = weekend ? "It's weekend" : "It's not weekend";
        System.out.println(mesage);
    }
}
