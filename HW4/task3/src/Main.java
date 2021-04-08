public class Main {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{2, -3, 1, 7};
        GenericArray<Integer> integerGenericArray = new GenericArray<>(intArr);

        System.out.println(intArr.toString());
        System.out.println("Largest element: " + integerGenericArray.largest());
        System.out.println("Smallest element: " + integerGenericArray.smallest());


        String[] strArr = new String[]{"zero", "first", "second"};
        GenericArray<String> stringGenericArray = new GenericArray<>(strArr);

        System.out.println(strArr.toString());
        System.out.println("Largest element: " + stringGenericArray.largest());
        System.out.println("Smallest element: " + stringGenericArray.smallest());

    }
}