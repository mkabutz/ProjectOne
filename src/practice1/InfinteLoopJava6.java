package practice1;

public class InfinteLoopJava6 {

    public static void main(String[] args) {
        // (2^31)-1
        for (int i = 0; i < Integer.MAX_VALUE; i += 2) {
            System.out.println("hello");
        }
        System.out.println("We are done");
    }
}

// this is infinite, but Java6 has a bug, and exits after a very short time.