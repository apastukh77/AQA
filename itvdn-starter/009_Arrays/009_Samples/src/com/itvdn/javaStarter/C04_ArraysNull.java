package com.itvdn.javaStarter;

public class C04_ArraysNull {
    // Массивы (одномерный массив).

    public static void main(String[] args) {
        //int[] array = new int[5];//выведит массив с элементами значения у которых 0
        //byte[] array = new byte[5];//выведит массив с элементами значения у которых 0
        //char[] array = new char[5]; //выведит массив с элементами значения у которых пустые места
        //String[] array = new String[5];//выведит массив с элементами значения у которых null
        Integer[] array = new Integer[5];//выведит массив с элементами значения у которых null

        // Вывод на экран значений элементов массива.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
