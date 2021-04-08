public class Main {
    public static void main(String[] args) {
        MyList<Integer> integerList = new MyList<>();

        integerList.add(21);
        integerList.add(4);
        integerList.add(2);

        System.out.println(integerList.toString());
        System.out.println("Largest number: " + integerList.largest());
        System.out.println("Smallest number: " + integerList.smallest());

        MyList<String> stringList = new MyList<>();
        stringList.add("21");
        stringList.add("D1");
        stringList.add("-3.2");
        System.out.println(stringList.toString());
        System.out.println("Largest element: " + stringList.largest());
        System.out.println("Smallest element: " + stringList.smallest());

    }
}

