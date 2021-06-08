package lambda_expressions.lambda3;


public class LambdaExpressionWithSingleParameter {
    public static void main(String[] args) {

        Sayable2 s = (name)->{return "Hello "+name;};
        System.out.println(s.say("Jhon Dow"));

        Sayable2 s1 = name->{return "Hello "+name;};
        System.out.println(s1.say("Jhon Took"));
    }
}
