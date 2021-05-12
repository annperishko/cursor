package task2;

import java.util.Scanner;

public class SafeDivision {
    double res;

    public static void safeDivision() {
        double res;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = scan.nextInt();
        System.out.println("Enter B: ");
        int b = scan.nextInt();

        while (true) {
            try {
                if (b == 0) {
                    throw new ArithmeticException();
                }
                res = (double) a / b;
                break;
            } catch (ArithmeticException exception) {
                System.out.println(exception.getMessage() + "Enter another B: ");
                b = scan.nextInt();
            }
        }
        System.out.println("Result: " + res);
    }
}
