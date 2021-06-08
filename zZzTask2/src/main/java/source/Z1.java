package source;

/**
 * @author Serhiy Dubovenko
 */
public class Z1 {

    // 1. Найти детерминант матрицы 3х3




    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1},
                          {1, 1, 1},
                          {0, 0, 1}};

        // вывод первого элемента матрицы matrix[0][0]
        System.out.println(matrix[0][0]);

        // вывод матрицы на экран
        for (int i = 0; i <matrix.length ; i++) {                                       // объявление цикла рядов матрицы
            for (int j = 0; j <matrix[i].length; j++) {                                 // объявление цикла проходящий ряд по элементно
                if(j<matrix[i].length-1){                                               // проверка ряда, когда выбираем последний элемент ряда выполняем переход на новую строку
                    System.out.print("matrix ["+i+"]["+j+"]: "+matrix[i][j]+"; ");      // печать в консоль
                }else{
                   System.out.println("matrix ["+i+"]["+j+"]: "+matrix[i][j]+"; ");      // печать в консоль
                }
            }

        }

        /*
         CTRL+SHIFT+/ <-- многострочный коментарий
         */

        // Детерминант
        int d = (matrix[0][0]*matrix[1][1]*matrix[2][2])-
                (matrix[0][0]*matrix[1][2]*matrix[2][1])-
                (matrix[0][1]*matrix[1][0]*matrix[2][2])+
                (matrix[0][1]*matrix[1][2]*matrix[2][1])+
                (matrix[0][2]*matrix[1][0]*matrix[2][1])-
                (matrix[0][2]*matrix[1][1]*matrix[2][0]);

        System.out.println("D: "+d);
    }




}
