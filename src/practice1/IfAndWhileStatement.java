package practice1;

import java.util.Scanner;

public class IfAndWhileStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt(); // instead of int number = 0;
            if (number < 0) {
                System.out.println("number is negative");
            } else if (number > 0) {
                System.out.println("number is positive");
            } else {
                System.out.println("number is zero");
            }
        }
    }
}