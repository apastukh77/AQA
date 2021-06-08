package source;

/**
 * @author Serhiy Dubovenko
 */
public class Z6 {

    public static void main(String[] args) {

        int[][][] mas = {{{1, 2, 3}, {2, 6, 7}, {4, 2, 9}},
                          {{11, 6, 31}, {11, 21, 31}, {11, 21, 31}},
                          {{11, 21, 31}, {11, 21, 31}, {41, 42, 34}}};


        for (int i = 0; i <mas.length ; i++) {
            for (int j = 0; j <mas[i].length ; j++) {
                for (int k = 0; k < mas[j].length; k++) {
                    System.out.println(mas[j][i][2]);
                }
            }
        }


        for (int[][] bufMass1 : mas){
            for (int[] bufMass2 : bufMass1){
                for(int buf : bufMass2){
                    System.out.println(buf);
                }
            }
        }



    }
}
