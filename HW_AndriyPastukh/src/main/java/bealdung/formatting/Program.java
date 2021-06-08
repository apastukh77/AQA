package bealdung.formatting;

public class Program {
    public static void main(String[] args) {
        String name = "Tom";
        int age = 30;
        float height = 1.7f;

        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);

        /**
         * s formats strings.
         * d formats decimal integers.// System.out.printf("simple integer: %d%n", 10000L);
         * // System.out.printf(Locale.US, "%,d %n", 10000); - output 10,000
         * f formats floating-point numbers.//System.out.printf("%f%n", 5.1473); - output 5.147300
         * //System.out.printf("'%5.2f'%n", 5.1473); output ' 5.15'
         * //System.out.printf("'%5.2e'%n", 5.1473); output - '5.15e+00'
         * t formats date/time values.
         * //Date date = new Date();// System.out.printf("%tT%n", date); output 13:51:15
         * //System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
         * output hours 13: minutes 51: seconds 15
         * //System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", date);
         * output - 13:51:15 pm 061 061000000 +0400
         * //System.out.printf("%1$tA, %1$tB %1$tY %n", date);
         * output - Thursday, November 2018
         * //System.out.printf("%1$td.%1$tm.%1$ty %n", date);
         * output - 22.11.18
         * n break the string into separate lines //System.out.printf("baeldung%nline%nterminator");
         * b To format Boolean values //System.out.printf("%b%n", null);
         * B To format Boolean values //for uppercase formatting//System.out.printf("%B%n", 5.3);
         * s To format a simple string //printf("'%S' %n", "baeldung");
         * //printf("'%15s' %n", "baeldung"); - to specify a minimum length, we can specify a width
         * // printf("'%-10s' %n", "baeldung");to left-justify our string, we can use the – flag:
         *
         * c is a Unicode character//System.out.printf("%c%n", 's');
         * C is a Unicode character // System.out.printf("%C%n", 's'); uppercase the result
         * */
    }
}
