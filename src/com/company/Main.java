package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //1. Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder)..
        Integer[] reverseArr = {2, 3, 1, 7, 11};
        Arrays.sort(reverseArr, Collections.reverseOrder());
        System.out.print("Array sorted in reverse order: " + Arrays.toString(reverseArr));

        /*2. You get an array of numbers(should contain both positive and negative numbers), and return the sum of all
         the positive ones. (If there are nothing to sum, sum should be 0)*/
        int[] array = {2, -5, -9, 7, 3, -1};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("\nSum = " + sum);

        /*3. You get an array of numbers, return the average of a list of numbers in this array. (Example -
         array{1,2,4,1} -> avg = 2)*/
        int[] average = {1, 2, 4, 9, -2};
        double avg = 0;
        double num = 0;

        for (int i = 0; i < average.length; i++) {
            num += average[i];
        }

        avg = num / (average.length);
        System.out.println("Average of a list: " + avg);

        /*4. *You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0. Result should be  next:
         {3,2,0,1,4,0,8,0}*/
        Integer[] duplicateArr = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < duplicateArr.length; i++) {
            for (int j = i + 1; j < duplicateArr.length; j++) {
                if (duplicateArr[i] == duplicateArr[j]) {
                    duplicateArr[j] = 0;
                }
            }
        }
        System.out.println("Result: " + Arrays.toString(duplicateArr));
    }
}
