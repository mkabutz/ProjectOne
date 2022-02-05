package practice1;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt(); // instead of int number = 0;

        if (number < 0) {
            System.out.println("number is negative");
        }

        else if (number > 0) {

            System.out.println("number is positive");

        }
        else {
            System.out.println("number is zero");
        }

    }

}