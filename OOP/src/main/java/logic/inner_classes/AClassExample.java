package logic.inner_classes;

/**
 * @author Serhiy Dubovenko
 */
public class AClassExample  {

    public static void main(String[] args) {

        // Внутренний класс
        class Square implements LambdaInterface{
            @Override
            public double triangle(int a, int b, int c) {
                int p = (a+b+c)/2;
                return Math.sqrt(p*(p-a)*(p-b)*(p-c));
            }
        }

        class Perimetr implements LambdaInterface{
            @Override
            public double triangle(int a, int b, int c) {
                return (a+b+c);
            }
        }
        Square s = new Square();
        Perimetr p =new Perimetr();

        System.out.println("Inner classes");
        System.out.println("\tSquare: "+s.triangle(3,4, 5));
        System.out.println("\tPerimetr: "+p.triangle(3,4, 5));

       // Анонимный класс
        LambdaInterface iSquare = new LambdaInterface() {
            @Override
            public double triangle(int a, int b, int c) {
                int p = (a+b+c)/2;
                return Math.sqrt(p*(p-a)*(p-b)*(p-c));
            }
        };


        LambdaInterface iPerimetr = new LambdaInterface() {
            @Override
            public double triangle(int a, int b, int c) {
                return  (a+b+c);
            }
        };
        System.out.println("Anonimus classes");
        System.out.println("\tSquare: "+iSquare.triangle(3,4, 5));
        System.out.println("\tPerimetr: "+iPerimetr.triangle(3,4, 5));

        // Лямбды
        LambdaInterface square = (a, b, c) -> {
            int p1 = (a+b+c)/2;
            return Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));
        };

        LambdaInterface perimetr = (a, b, c) -> {
            return (a+b+c);
        };

        System.out.println("Lamdas");
        System.out.println("\tSquare: "+square.triangle(3,4, 5));
        System.out.println("\tPerimetr: "+perimetr.triangle(3,4, 5));



    }

}
