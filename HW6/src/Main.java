import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        String task1 = "df jhuui./iej545";
        StringAnalyse str = new StringAnalyse(task1);
        System.out.println("Task 1\n" + str.toString());


        System.out.println("\nTask 2");
        String path = "Tolstoi.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        TextAnalyse task2 = new TextAnalyse(scanner);
        System.out.println(task2.toString());

        scanner.close();


    }
}
