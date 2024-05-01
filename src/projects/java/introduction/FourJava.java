package projects.java.introduction;

import java.util.Scanner;

public class FourJava {

    public static void main(String[] args) {
        // write your code here
        Scanner yourName = new Scanner(System.in);
        String putName;
        String otherName;

        System.out.println("Enter your name: ");
        putName = yourName.nextLine();

        System.out.println("Name: " + putName.toUpperCase());
        System.out.println("Name: " + putName.toLowerCase());
        System.out.println("Name: " + putName.length() + " characters.");

        System.out.println("Enter other name: ");
        otherName = yourName.nextLine();

        System.out.println("True or False: " + putName.equals(otherName));
        System.out.println("True or False: " + putName.equalsIgnoreCase(otherName));
    }
}
