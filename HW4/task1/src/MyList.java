import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

    public class MyList<T extends Number >{
        private ArrayList<T> arrayList;
        public MyList() {
            arrayList = new ArrayList<>();
        }

        public void add(T element){
            arrayList.add(element);
        }

        public T largest(){
            return arrayList.stream().max(Collections.reverseOrder()).orElseThrow(() ->
                    new NoSuchElementException("List is empty"));
        }
        public  T smallest(){
            return arrayList.stream().min(Collections.reverseOrder()).orElseThrow(() ->
                    new NoSuchElementException("List is empty"));
        }
        @Override
        public String toString(){
            return "List: " + arrayList;
        }
    }

