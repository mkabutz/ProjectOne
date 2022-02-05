package practice1;

public class sumofarray {

    public static void main(String[] args){

        int[] numbers = {1, 3, -1, -6, 2};
        int multiply = 1;

        for (int number: numbers) {
            multiply *= number;

            System.out.println("Multiply = " + multiply);
        }
    }
}

