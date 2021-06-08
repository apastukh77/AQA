package leetcode;
import java.util.Arrays;
public class KidsCandies {

        public static void main(String args[]) {

            int [] candies = {2,3,5,1,3};

            for (int eachEl : candies) System.out.print(eachEl +"\t");

            System.out.println();

            System.out.println(Arrays.toString(candies));

            int extraCandies = 3;

            int max = candies[0];

            for (int i = 0; i < candies.length; i ++){

                if (candies[i]>max) {

                    max = candies[i];
                }
            }

            System.out.println(max);

            boolean [] result = new boolean [5];

            int j = 0;

            for (int i = 0; i < candies.length; i ++){

                result[j] = ((candies[i] + extraCandies)>=max && j< result.length) ? true : false ;

//                if ((candies[i] + extraCandies)>=max && j< result.length){
//
//                    result[j] = true;
//
//                }
//                else {
//                    result[j] = false;
//                }
                j++;
            }

            System.out.println(Arrays.toString(result));

        }

}
