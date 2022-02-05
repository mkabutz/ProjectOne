package practice1;// Java program to find the sum of positive numbers
import java.util.Scanner;

public class sumofpositivenumbers {
    public static void main(String[] args) {

    int sum = 0;
    int number = 0;

    Scanner input  = new Scanner(System.in);

    do{
        sum += number;
            System.out.println("Enter a number: ");
            number=input.nextInt();
            } while(number >=0);

        System.out.println("multiplication is equal to = " + sum);
        input.close();
            }
}