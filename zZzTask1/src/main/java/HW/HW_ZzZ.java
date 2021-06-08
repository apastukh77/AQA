package HW;

//import java.util.Arrays;

public class HW_ZzZ {

    public static void main(String args[]) {

        int[] arr = new int [] {1, 4, 5, 7, 20, 6, 4, 6, 5, 7, 14, 2, 10, 3, 6, 5, 7, 10, 4, 10};

        //Arrays.sort(arr);
        //System.out.println("Sorted Array is :: = " + Arrays.toString(arr));

        int temp = 0;

        System.out.print("Unique Duplicates values which have more than 2 dublicates in array are : ");
        for (int i=0; i < arr.length; ++i) {
            for (int j=1; j < (arr.length - i); ++j) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        int numDuplicate = 0, dupCount = 0;
        int previous = -1;
        for (int i=0; i < arr.length; ++i) {
            if (arr[i] == previous) {
                numDuplicate = numDuplicate + 1;
                if (numDuplicate == 1) {
                    ++dupCount;
                    if (dupCount == 1) {
                        System.out.print(arr[i]);
                    }
                    else {
                        System.out.print(", " + arr[i]);
                    }
                }
            }
            else {
                previous = arr[i];
                numDuplicate = 0;
            }
        }

        System.out.println("\nNumber of unique duplicates values: " + dupCount);
        System.out.print("\n");
        System.out.print("\\------------------------------------------------------------\n\n");


        int counter = 0;
        boolean[] duplicate = new boolean[arr.length];

        System.out.print("List of each duplicates values which have more than 2 dublicates in array:\n ");
        System.out.print("\n");

        for (int i = 0; i < arr.length -1; i++){


            for (int j = i+1; j < arr.length; j++) {


                if(!duplicate[j] && arr[i] == arr[j]  )  {
                    duplicate[j] = true;
                    counter++;
                    System.out.println("Counter each duplicate element :  "  + counter);
                    System.out.println("Duplicate Element which has more than 2 dublicates in array is : " + arr[j]);
                    System.out.println("Index of that duplicate element : " + j);
                    System.out.print("\n");
                }

            }

        }


    }


}
