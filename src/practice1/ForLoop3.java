package practice1;

public class ForLoop3 {
    public static void main(String[] args) {

        int n = 1000 * 1000;
        long sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += i;
        }

        System.out.println("Sum = " + sum);

    }
}


