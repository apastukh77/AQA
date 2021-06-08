package logic;

import java.util.Arrays;

/**
 * @author Serhiy Dubovenko
 */
public class Example2 {

    /*
      Получить массив чисел которые встречаются в массиве более 2-х раз.
     */

    public static void main(String[] args) {
        int[] inputArray = {3, 5, 6, 2, 3, 6, 9, 3, 11, -8, 3, 0, 5, 7, 9, 6};
        System.out.println(Arrays.toString(inputArray));

        Arrays.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));

        int numberOfElements = 0;

        for (int i = 0; i < inputArray.length; i++) {
            int counter = 0;
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    counter++;
                }
            }

            if((counter>2)&&(inputArray[i]!=inputArray[i-1])){
                numberOfElements++;
            }
        }

        System.out.println("numberOfElements: "+numberOfElements);

        int[] resultArray = new int[numberOfElements];
        int k =0;
        while (k<resultArray.length) {
            for (int i = 0; i <inputArray.length; i++) {
                int counter = 0;
                for (int j = 0; j < inputArray.length; j++) {
                    if (inputArray[i] == inputArray[j]) {
                        counter++;
                    }
                }

                if((counter>2)&&(inputArray[i]!=inputArray[i-1])){
                    resultArray[k]=inputArray[i];
                    k++;
                }
            }
        }

       System.out.println("Ответ:"+Arrays.toString(resultArray));


    }




}
