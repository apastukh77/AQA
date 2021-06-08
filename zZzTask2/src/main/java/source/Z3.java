package source;

/**
 * @author Serhiy Dubovenko
 */
public class Z3 {

    // 3. Найти среднее арифметическое значение квадратной матрицы

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 12},
                          {1, 1, 1, 0, 10},
                          {0, 0, 1}};

        int count =0;
        int sum = 0;




        for (int i = 0; i <matrix.length ; i++) {
            count+=matrix[i].length;
            //count=count+matrix[i].length;
        }

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                sum+=matrix[i][j];
            }
        }

        System.out.println("Result: "+(sum/count));


    }

}
