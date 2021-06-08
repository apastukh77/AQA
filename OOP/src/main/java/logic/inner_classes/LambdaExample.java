package logic.inner_classes;


import logic.inner_classes.LambdaInterface.*;

/**
 * @author Serhiy Dubovenko
 */

public class LambdaExample {


    public static void main(String[] args) {
        LambdaInterface square = (a, b, c) -> {
            int p = (a+b+c)/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        };

        LambdaInterface perimetr = (a, b, c) -> {
            return (a+b+c);
        };


        System.out.println("square: "+square.triangle(3,4, 5));
        System.out.println("perimetr: "+perimetr.triangle(3,4, 5));

    }


}
