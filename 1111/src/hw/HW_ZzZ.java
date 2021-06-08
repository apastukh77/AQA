package hw;

import java.util.Arrays;

public class HW_ZzZ {

    public static void main(String args[]) {

        int[] arr = new int[]{-2, 4, 5, 7, 20, 6, 4, 6, 5, 7, 14, 14, 2, 10, 3, 6, 5, -2, 7, 10, 4, 14, 10, -2};

        Arrays.sort(arr);
        System.out.println("Sorted Array is :: = " + Arrays.toString(arr));

        int temp = 0;

        System.out.print("Unique Duplicates values which have more than 2 dublicates in array are : ");
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 1; j < (arr.length - i); ++j) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
