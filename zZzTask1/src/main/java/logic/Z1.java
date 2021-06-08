package logic;

/**
 * @author Serhiy Dubovenko
 *
 */
public class Z1 {

    /*
        01) Найти сумму элементов массива между двумя первыми нулями. Если двух нулей нет в массиве, то вывести ноль.
            1) Индекс первого 0 элемента массива
            2) Индекс второго 0 элемента массива
            3) Проверка диапазона.
            4) нахождение суммы
      */
    public int getSum(int[] arr){
        int sum = 0;

        int indexFirstZero = -1;
        int indexSecondZero = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                indexFirstZero=i;
                break;
            }
        }
        if(indexFirstZero>=0){
            for (int i = indexFirstZero+1; i < arr.length; i++) {
                if(arr[i]==0){
                    indexSecondZero=i;
                    break;
                }
            }
        }else{
            System.err.println("В массиве нет элементов со значением 0");
            return 0;
        }

       if ((indexSecondZero > 0)&&(indexSecondZero!=indexFirstZero)){
           for (int i = indexFirstZero; i <indexSecondZero; i++) {
               sum=sum+arr[i];
           }

        }else{
           System.err.println("В массиве только 1 элемент");
           return 0;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {1,4,5,0,7,8, 8,4,5,6,7,0,5,};
        int[] arrTest = {1,4,5,0,1,2,3,0,5,6,7,0,5,};
        int[] arrTest1 = {1,4,5,7,1,2,3,9,5,6,7,3,5,};
        int[] arrTest2 = {1,4,5,0,1,2,3,0,5,6,7,0,5,};
        int[] arrTest3 = {0,4,5,1,1,2,3,8,5,6,7,0,5,};
        int[] arrTest4 = {0,4,5,1,1,2,3,8,5,6,7,9,5,};
        int[] arrTest5 = {0,0,5,1,1,2,3,8,5,6,7,9,5,};

        Z1 zadacha1 = new Z1();

        int sum = zadacha1.getSum(arrTest5);
        int sum1 = zadacha1.getSum(arrTest1);
        int sum2 = zadacha1.getSum(arrTest2);
        int sum3 = zadacha1.getSum(arrTest3);
        int sum4 = zadacha1.getSum(arrTest4);
        int sum5 = zadacha1.getSum(arrTest1);

        System.out.println("SUM: "+sum);


    }


}
