package leetcode;

public class CustomersWealth {

    public static void main(String args[]) {

        int [][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        System.out.println("All accounts in the banks are: "+"\n");

        for (int i = 0; i < accounts.length; i++ )  {

            for (int j = 0; j < accounts[i].length; j++ )  System.out.print(  "[" + i + "]" + "[" + j + "]" + " " + accounts[i][j] + "\t\t");

            System.out.println(  );
        }

        int maxsum = 0, sum;

        for (int i = 0; i < accounts.length; i++ )  {
            sum=0;

            for (int j = 0; j < accounts[i].length; j++ ){

                sum += accounts[i][j];

            }
            System.out.print( "\n"+"Wealth customer is: " +  sum + "  ");

            if (maxsum < sum) maxsum = sum;

        }

        System.out.println("\n"+"--------------------------------------------------------------------------------");

        System.out.println(" \n"+ "Maximum wealth: " + maxsum);
    }
}
