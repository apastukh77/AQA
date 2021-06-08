package w3school.inner_class;

public class OuterClass {
    int x = 10;

    class InnerClass{
        int y = 5;
    }
}
//Without 'public', it may be in here

/**
 * class Main { //Without 'public', it may be in one file OuterClass
 *
 *         public static void main(String[] args) {
 *             OuterClass myOuter = new OuterClass();
 *             OuterClass.InnerClass myInner = myOuter.new InnerClass();
 *             System.out.println(myInner.y + myOuter.x);
 *         }
 * }
 * */



