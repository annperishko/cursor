import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    private static final String FILE_NAME = "data.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        var f = new FileCheck();
        System.out.println("Amount of words in data.txt: " + f.getListOfWords(FILE_NAME).size() +
                "\nList of deleted words: " + f.extraWords(FILE_NAME) +
                "\nAmount of deleted words: " + f.extraWords(FILE_NAME).size() +
                "\nMax repeated word: " + f.maxRepeatedWord(FILE_NAME));


    }
}
