package logic.functiona_iInterface;

public class FI_Test {

    public static void main(String[] args) {

        FInterface fi_abstract = new FInterface() {
            @Override
            public double getSumm(int a, int b) {
                return Math.round(a+b/0.5);
            }
        };


        FInterface fi1 = (a, b) ->{
            return a+b;
        };

        FInterface fi2 = (a, b) ->{
            return (int) (Math.sin(a/a)+Math.cos(b/b));
        };

        int a = 5;
        int b = 6;
        System.out.println("FI_1");
        System.out.println(fi1.getSumm(a, b));

        System.out.println("FI_2");
        System.out.println(fi2.getSumm(a, b));

        System.out.println("Init variables of interface using anonymous class");
        System.out.println(fi_abstract.getSumm(a, b));
    }

}
