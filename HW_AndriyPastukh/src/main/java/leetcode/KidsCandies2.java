package leetcode;

import java.util.Arrays;

public class KidsCandies2 {

    public static void main(String args[]) {

        int[] candies = {12, 1, 12};

        System.out.println(Arrays.toString(candies));

        int extraCandies = 10;

        int max = candies[0];

        for (int i = 0; i < candies.length; i++) {

            if (candies[i] > max) {

                max = candies[i];
            }
        }

        System.out.println(max);

        boolean[] result = new boolean[3];

        int j = 0;

        for (int i = 0; i < candies.length; i++) {

            if ((candies[i] + extraCandies) >= max && j<result.length) {

                result[j] = true;

            } else {
                result[j] = false;
            }
            j++;
        }

        System.out.println(Arrays.toString(result));
    }
}
