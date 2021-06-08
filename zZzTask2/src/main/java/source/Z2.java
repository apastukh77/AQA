package source;

/**
 * @author Serhiy Dubovenko
 */
public class Z2 {

    //   2. Выполнить табуляцию функции y=2*x*x+8x-7;

    // [5, 10] 5 ... 10  ] --- вхождение числа в диапазон
    // (5, 10) 6 ... 9   ) --- не попадает в диапазон
    // (5, 10] [5, 10)
    //  6 - 10  5 - 9

    public static void main(String[] args) {
        // [-7, 20]
        int min = -7;
        int max = 20;

        for (int x = min; x<=max; x++){
            double y = 2*Math.pow(x, 2)+8*x-7;
            System.out.println("Y = "+y+"; X ="+x+";");
        }
    }



}
