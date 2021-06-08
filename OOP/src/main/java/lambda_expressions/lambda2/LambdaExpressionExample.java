package lambda_expressions.lambda2;

public class LambdaExpressionExample {

    public static void main(String[] args) {
        Sayable s = ()->{return "I have nothing to say";};
        System.out.println(s.say());
    }
}
