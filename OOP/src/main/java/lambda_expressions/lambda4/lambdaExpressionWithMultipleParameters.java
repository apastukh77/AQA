package lambda_expressions.lambda4;

public class lambdaExpressionWithMultipleParameters {
    public static void main(String[] args) {

        Addable aa = (a, b) -> (a + b);
        System.out.println(aa.add(10, 20));

        Addable aa1 = (int a, int b) -> (a + b);
        System.out.println(aa1.add(100, 200));

        Addable ad2=(int a,int b)->{ return (a+b); };
        System.out.println(ad2.add(250,250));
    }
}
