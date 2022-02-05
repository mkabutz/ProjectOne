package practice1;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class LargestNum {
    public static void main(String[] args) {
        double a = -3.4, b = -2.1, c = -2.1, largest;

/*
        if (a >= b) {
            if (a >= c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b >= c) {
                largest = b;
            } else {
                largest = c;
            }
        }
*/

        test(a, b, c);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    test(i, j, k);
                }
            }
        }

        testBetter(a, b, c);
        testEvenBetter(a, b, c);

        largest = testOther(a, b, c);
        System.out.println("largest = " + largest);
        print(findMaxValue(a, b, c));
        print(findMaxValue(a, b));
        print(findMaxValue(a));
        print(findMaxValue());
        print(findMaxValue(3, 5, 5, 2, 1, 6, 78, 1, 4, 3, 6, 1, 3, 5, 6, 1, 3, 5, 3));

        System.out.println("Enter all the doubles");
        Scanner scanner = new Scanner(System.in);

        OptionalDouble max = findMaxValue(scanner.tokens()
                .takeWhile(s -> !s.equals("quit")).mapToDouble(Double::parseDouble).toArray());
        print(max);
    }

    private static void print(OptionalDouble max) {
        max.ifPresentOrElse(System.out::println, () -> System.out.println("No max"));
    }

    private static void test(double a, double b, double c) {
        double largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else if (c >= a && c >= b) { // always true
            largest = c;
        } else {
            throw new AssertionError();
        }
        System.out.println("largest = " + largest);
    }

    // pretty good if you need if/else
    private static double testOther(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

    private static double testOther2(double a, double b, double c) {
        return Double.max(a, Double.max(b, c));
    }

    public static OptionalDouble findMaxValue(double... values) {
        return Arrays.stream(values).max();
    }

    private static void testBetter(double a, double b, double c) {
        System.out.println("LargestNum.testBetter");
        double largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else { // always true
            largest = c;
        }
        System.out.println("largest = " + largest);
    }

    private static void testEvenBetter(double a, double b, double c) {
        System.out.println("LargestNum.testEvenBetter");
        DoubleAccumulator largest = new DoubleAccumulator(Double::max, a);
        largest.accumulate(b);
        largest.accumulate(c);
        System.out.println("largest = " + largest);
    }
}

// else