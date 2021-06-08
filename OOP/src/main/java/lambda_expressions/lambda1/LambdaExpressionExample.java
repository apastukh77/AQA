package lambda_expressions.lambda1;

import lambda_expressions.lambda1.Drawable;

public class LambdaExpressionExample {
            public static void main(String[] args) {
            int width = 10;

            Drawable d =()->{
                System.out.println("Drawing with width "+10);
            };
        d.draw();
        //==============equivalent======================
//                Drawable d=new Drawable(){
//                    public void draw(){System.out.println("Drawing "+width);}
//                };
//                d.draw();
// ==============equivalent======================
            }
}
