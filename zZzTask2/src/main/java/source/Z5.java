package source;

/**
 * @author Serhiy Dubovenko
 */
public class Z5 {


    public static void main(String[] args) {
        // одномерный массив
        /*int[] mas = {3, 4, 6, 7};

        System.out.println(mas[0]);
        System.out.println(mas[1]);
        System.out.println(mas[2]);
        System.out.println(mas[3]);

        for (int i = 0; i < mas.length ; i++) {
            System.out.println(mas[i]);
        }*/


        // двумерный массив
        int[][]mas = {{9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 81}};

        System.out.println(mas[0][0]);
        System.out.println(mas[0][1]);
        System.out.println(mas[0][2]);

        System.out.println(mas[1][0]);
        System.out.println(mas[1][1]);
        System.out.println(mas[1][2]);

        System.out.println(mas[2][0]);
        System.out.println(mas[2][1]);
        System.out.println(mas[2][2]);

        for (int i = 0; i <mas.length ; i++) {
            for (int j = 0; j <mas[i].length ; j++) {
                System.out.println(mas[i][j]);
            }
        }
    }
}
