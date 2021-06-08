package HW;

public class HW_Functions {

    public static void main(String args[]) {

        double i1 = 0.1;
        double i2 = 0.01;
        double y1, x1;
        double y2, x2;


        System.out.println( " Function values y1 = 2*sin(x)-4; in the range [-5, 5] with step 0.1;");

        for(x1 = -5.0; x1<=5.0; x1 += i1){

            y1 = 2*Math.sin( x1 ) -4;

            System.out.print( "y1 = " + y1 + ";\n");

        }


        System.out.println( " Function values y2 = 2*tg(x)-4*sin(2*x); in the range [-1, 1] with step 0.01;");

        for(x2 = -1.00; x2<=1.00; x2 += i2){

            y2 = 2*Math.tan(x2)-4*Math.sin(2*x2);

            System.out.print( "y2 = " + y2 + ";\n");

        }

    }

}
