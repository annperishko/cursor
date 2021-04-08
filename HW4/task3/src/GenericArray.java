
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class GenericArray<T extends Comparable<T> >{
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T largest(){
        return Arrays.stream(array).max(Comparator.naturalOrder()).orElseThrow(() ->
                new NoSuchElementException("List is empty"));
    }
    public  T smallest(){
        return Arrays.stream(array).min(Comparator.naturalOrder()).orElseThrow(() ->
                new NoSuchElementException("List is empty"));

    }
    @Override
    public String toString(){
        return "Array: " + array;
    }
}