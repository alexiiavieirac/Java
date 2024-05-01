package projects.java.introduction;

import java.util.Scanner;

public class ThreeJava {

    public static void main(String[] args) {
        // write your code here
        Scanner noteStudent = new Scanner(System.in);
        int noteClass;

        System.out.println("Enter your note: ");
        noteClass = noteStudent.nextInt();

        System.out.println("Note: " + noteClass);

        // Conditional Structure:
        // A >= 80 | B < 80 && B >= 70 | C < 70 && C >= 60 | D < 60 && D >= 0 | Note != int numbers between 0 and 100

        String graduation;

        if (noteClass >= 80) {
            graduation = "A";
        } else if (noteClass >= 70) {
            graduation = "B";
        } else if (noteClass >= 60) {
            graduation = "C";
        } else if (noteClass >= 0) {
            graduation = "D";
        } else {
            graduation = "";
        }

        switch (graduation) {
            case "A":
            case "B":
                System.out.println("Student Approved!");
                break;
            case "C":
            case "D":
                System.out.println("Student not Approved.");
                break;
            case "":
                System.out.println("You put the wrong note.");
                break;
        }
    }
}
