import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FileCheck {

    public String getText(String fileName) throws IOException, URISyntaxException {
        var file = Objects.requireNonNull(getClass().getClassLoader().getResource(fileName)).toURI();
        return Files.readString(Path.of(file));
    }

    public List<String> getListOfWords(String fileName) throws IOException, URISyntaxException {
        return Arrays.stream(getText(fileName).replace('\n', ' ').chars()
                .filter(c -> Character.isAlphabetic(c) || c == ' ' || c == '\'')
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString().split(" "))
                .filter(s -> !s.isBlank())
                .collect(Collectors.toList());
    }


    public List<String> deleteExtraWords(String fileName) throws IOException, URISyntaxException {
        List<String> allWords = getListOfWords(fileName);
        List<String> swearWords = getListOfWords("swear_words.txt");

        allWords.removeAll(swearWords);
        return allWords.stream()
                .filter(word -> word.length() > 2)
                .collect(Collectors.toList());

    }

    public Map<String, Long> getWordsAmountMap(String fileName) throws IOException, URISyntaxException {
        return deleteExtraWords(fileName).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public List<String> extraWords(String fileName) throws IOException, URISyntaxException {
        if (fileName == null) {
            return Collections.emptyList();
        }

        List<String> words = getListOfWords(fileName);
        words.removeAll(deleteExtraWords(fileName));
        return words;
    }

    public Map.Entry<String, Long> maxRepeatedWord(String fileName) throws IOException, URISyntaxException {
        return getWordsAmountMap(fileName).entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .orElseThrow(NoSuchElementException::new);
    }


}
