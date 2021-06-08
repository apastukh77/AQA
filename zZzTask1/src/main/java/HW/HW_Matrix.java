package HW;

public class HW_Matrix {

    public static void main(String args[]) {

        int[][] matrix = {{5, 8, 9, 2},
                {6, 12, 11, 4},
                {1, 0, 3, 1}};

        int n, m;
        n = 3;
        m = 4;

        int[][] tMatrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print("matrix [" + i + "][" + j + "] " + matrix[i][j] + "\t\t");

            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < tMatrix.length; i++) {
            for (int j = 0; j < tMatrix[i].length; j++) {
                tMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Result: ");
        for (int i = 0; i < tMatrix.length; i++) {
            for (int j = 0; j < tMatrix[i].length; j++) {

                System.out.print("tMatrix [" + i + "][" + j + "] " + tMatrix[i][j] + "\t");

            }
            System.out.println();
        }

    }
}

