package logic;

import java.util.Arrays;

/**
 * @author Serhiy Dubovenko
 */
public class Example1 {

    /*
      Получить массив чисел которые встречаются в массиве более 2-х раз.
     */

    public static void main(String[] args) {
        int[] inputArray = {3, 5, 6, 2, 3, 6, 9, 3, 11, -8, 3, 0, 5, 7, 9, 6, 9, 12, 12, 12};           // входной массив
        int[] resultArray = new int[0];                                                  // результирующий массив 0-й длинны

        for (int i = 0; i < inputArray.length; i++) {                                    // проход входящим массивом
            int counter = 0;
            for (int j = 0; j < inputArray.length; j++) {                                // расчет повторений элемента в массиве
                if (inputArray[i] == inputArray[j]) {
                    counter++;
                }
            }

          // System.out.println(i + ") inputArray: " + inputArray[i] + "; Count:  " + counter);   // печать элемента массива и количества повторений в консоль
            boolean flag = false;                                                                // флаг уникальности элемента в результирующем массиве (необходим для добавления только уникальных элементов)

                                                                                              // формирование результирующего массива
            if (counter > 2) {                                                                // фильтр элементов с количеством >2
                for (int j = 0; j < resultArray.length; j++) {                                // проход массивом результатов и проверка на существование элемента
                    if (inputArray[i] == resultArray[j]) {
                        flag = true;
                    }
                }
                if (flag==false) {                                                            // добавление уникального элемента (если не был ранее добавлен)
                    resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);      // расширение массива результатов
                    resultArray[resultArray.length - 1] = inputArray[i];                     // добавление элемента в результирующий массив
                }
            }
        }

        System.out.println("Ответ:"+Arrays.toString(resultArray));


    }


}
