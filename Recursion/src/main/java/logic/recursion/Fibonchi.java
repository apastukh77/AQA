package logic.recursion;

import java.util.ArrayList;

/**
 * @author Serhiy Dubovenko
 */
public class Fibonchi {
    /*
        Построитьчисловой ряд чисел фибоначчи используя рекурсивную функцию.
     */
    public static int printFibonachi (int number){

        if(number==0){
            return 1;
        }
        if(number==1){
            return 1;
        }

         return printFibonachi(number-1)+printFibonachi (number-2);
    }
    //   0 1 2 3 4 5  6  7
    //    1 1 2 3 5 8 13 21

    public static void main(String[] args) {
        System.out.println(printFibonachi(7));
    }
}
