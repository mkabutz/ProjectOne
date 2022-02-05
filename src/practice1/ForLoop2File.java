package practice1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ForLoop2File {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("Output.text");


        int n = 1000 * 1000;
        long time = System.nanoTime();
        for (int i = 1; i <= n; i++) {

            out.println(i);
        }
        out.println("done");
        time = System.nanoTime() - time;
        out.printf("time = %,d%n", time/1000000);
        out.close();
    }
}