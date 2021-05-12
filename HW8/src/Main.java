import task1.ExceptionA;
import task1.ExceptionB;
import task2.SafeDivision;
import task3.Rethrowing;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("\tTask 1");
        try {
            throw new ExceptionA("Exception A");
        } catch (ExceptionA exception) {
            System.out.println(exception.getMessage());
        }

        try {
            throw new ExceptionB("Exception B");
        } catch (ExceptionB exception) {
            System.out.println(exception.getMessage());
        }

        try {
            throw new NullPointerException("NullPointerException");
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            throw new IOException("IOException");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("\tTask 2");
        SafeDivision.safeDivision();

        System.out.println("\tTask 3");
        try {
            Rethrowing.someMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
