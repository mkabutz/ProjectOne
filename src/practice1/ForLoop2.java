package practice1;

public class ForLoop2 {

    public static void main(String[] args) {

        int n = 1000 * 1000;
        long time = System.nanoTime();
        for (int i = 1; i <= n; i++) {

            System.out.println(i);
        }
        System.out.println("done");
        time = System.nanoTime() - time;
        System.out.printf("time = %,d%n", time/1000000);

    }
}