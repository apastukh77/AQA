package logic;

import java.util.Arrays;

/**
 * @author Serhiy Dubovenko
 */
public class Z4 {

    /*
      04) Найдите сумму номеров (индексов) минимального и максимального элементов.
        4.1 Находи индекст минимального элемента
        4.2 Находи индекст максимального элемента
        4.3.Находим сумму индексов
        4.4 Если элементов с минимальным или максимальным значением >1, выбрать 1-й элемент при прохождении.
     */



    int getSum(int[] arr){
        int[] temp = new int[arr.length];
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
        }

        int indexMin = 0;
        int indexMax = 0;

        Arrays.sort(temp);

        System.out.println(Arrays.toString(temp));

        System.out.println(Arrays.toString(arr));
        int minValue = temp[0];
        int maxValue = temp[temp.length-1];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==minValue){
                indexMin= i;
            }
            if(arr[i]==maxValue){
                indexMax = i;
            }
        }
        System.out.println("Index of max element: "+indexMax);
        System.out.println("Index of min element: "+indexMin);

        return indexMin+indexMax;

    }



    public static void main(String[] args) {
        int[] arr = {1, -4, 5, 0, 7, 8, -8, 4, 5, 6, -7, 0, 5,};
        Z4 zadacha4 = new Z4();
        int sum = zadacha4.getSum(arr);
        System.out.println("Result: "+sum);


    }
}
