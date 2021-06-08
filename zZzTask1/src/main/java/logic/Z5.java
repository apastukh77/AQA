package logic;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

/**
 * @author Serhiy Dubovenko
 */
public class Z5 {

    /*
      05) Найти среднее арифметическое массива из 10 элементов типа double.
     */
    public static void main(String[] args) {
        double[] mass = {1.5, 5.0, 1.3};
        int i = 0;
        double sum = 0;

        do {
            sum = sum + mass[i];
            i++;
        } while (i < mass.length );

        System.out.println(sum/mass.length);
    }
}
