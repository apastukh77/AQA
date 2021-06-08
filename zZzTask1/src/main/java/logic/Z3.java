package logic;

import java.util.Arrays;

/**
 * @author Serhiy Dubovenko
 */
public class Z3 {

    /*
       03) Преобразовать массив так, чтобы сначала шли нулевые элементы, а затем все остальные. Сортировать массив нельзя.
         3.1. Создаем результирующий массив
         3.2. Выполняем добавление 0 элементов
         3.3. Выполняем добавление >0 элементов
     */

    protected int[] getUpdatedArray(int[] arr) {

        int[] temp = new int[arr.length];                 // Объявляем результирующий массив

        int counter = 0;                                  // объявляем счетчик элементов с 0-м значением
        for (int i = 0; i < arr.length; i++) {            // путем перебора хаходим кол-во 0-х элементов
            if (arr[i] == 0) {
                counter++;
            }
        }

        while (counter < temp.length) {                   // заполняем результирующий массив не 0-ми значениями
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    temp[counter] = arr[i];
                    counter++;
                }
            }
        }

        return temp;                                       // возвращаем результат на экран

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 0, 7, 8, 8, 4, 5, 6, 7, 0, 5,};
        Z3 zadacha3 = new Z3();
        System.out.println(Arrays.toString(zadacha3.getUpdatedArray(arr)));
    }


}
