public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(21);
        list.add(4);
        list.add(2);
        list.add(-8);
        list.add(17);

        System.out.println(list.toString());
        System.out.println("Largest number: " + list.largest());
        System.out.println("Smallest number: " + list.smallest());


    }
}

