package logic.inner_classes;

/**
 * @author Serhiy Dubovenko
 */
public class NestedInnerClasses {

    private String className;

    public void print(String text){
        System.out.println("NestedInnerClasses");
    }


    class Example{
        private String classNameExample;

        public void Example(String text){
            System.out.println("NestedInnerClasses");
        }

        class Example2{

        }

    }


    public static void main(String[] args) {
        NestedInnerClasses niClass = new NestedInnerClasses();
        System.out.println(niClass.new Example().classNameExample.length());
        new NestedInnerClasses()
                .new Example()
                .new Example2();


    }


}
