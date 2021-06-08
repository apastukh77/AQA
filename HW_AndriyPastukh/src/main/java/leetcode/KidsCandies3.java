package leetcode;

import java.util.Arrays;

public class KidsCandies3 {

    public static void main(String args[]) {

        int [] candies = {4,2,1,1,2};

        System.out.println(Arrays.toString(candies));

        int extraCandies = 1;

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

            if ((candies[i] + extraCandies) >= max && j< result.length){

                result[j] = true;

            }
            else {
                result[j] = false;
            }
            j++;
        }

        System.out.println(Arrays.toString(result));

    }

}