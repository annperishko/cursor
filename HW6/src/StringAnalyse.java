import java.util.HashMap;
import java.util.Map;

public class StringAnalyse {
    private String str;

    public StringAnalyse(String str) {
        this.str = str;
    }

    public static HashMap<Character, Integer> strMap(String str) {
        HashMap<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer n = chars.get(c);
            chars.put(c, n == null ? 1 : n + 1);
        }
        return chars;
    }

    public int amountOfSigns(String str) {
        String signs = str.replaceAll("[^\\p{Punct}]", "");
        return signs.length();
    }

    public int amountOfLetters(String str) {
        String letters = str.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "");
        return letters.length();
    }

    public int amountOfSpaces(String str) {

        String signs = str.replaceAll("[^ ]", "");
        return signs.length();
    }

    private String getLetters(String str) {
        return str.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "");
    }

    public int amountOfNumbers(String str) {
        String numbers = str.replaceAll("[^\\d]", "");
        return numbers.length();
    }

    @Override
    public String toString() {
        String string = "";

        string = string + "Amount of letters: " + amountOfLetters(str)
                + "\nAmount of signs: " + amountOfSigns(str)
                + "\nAmount of numbers: " + amountOfNumbers(str)
                + "\nAmount of spaces: " + amountOfSpaces(str);
        return string;
    }
}
