package com.itvdn.javaStarter;

public class IndexOfMaxMin {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 10) - 5);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int maxVal = arr[0];
        int minVal = arr[0];
        int indexOfMin = 0;
        int indexOfMax = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxVal) {maxVal = arr[i];indexOfMax=i;}
            else if (arr[i] < minVal) {minVal=arr[i]; indexOfMin=i;}
        }
        System.out.println();
        System.out.printf("Максимальное значение: %d под индексом %d массива; минимальное значение: %d под индексом %d массива.", maxVal,indexOfMax,minVal,indexOfMin);
    }

}


