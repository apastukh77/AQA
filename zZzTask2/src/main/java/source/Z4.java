package source;

/**
 * @author Serhiy Dubovenko
 */
public class Z4 {

    // 4. Найти сумму остатков от деления на 6 в произвольной матрице.

    public static void main(String[] args) {
        int[][] matrix = {{7, 6, 6, 5},
                {6, 1, 6, 6, 6},
                {6, 6, 6}};

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j] % 6;
            }
        }





        System.out.println("Result: " + sum);
    }

}
