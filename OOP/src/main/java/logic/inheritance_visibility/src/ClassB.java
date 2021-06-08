package logic.inheritance_visibility.src;

/**
 * @author Serhiy Dubovenko
 */
public class ClassB extends ClassA {

    public void workMethod(){
       //  getPrivateMethod("String text") - error as method is private (ClassA only)
        getPackageMethod("String text",1);
        getProtectedMethod("String text", 2);
        getPublicMethod("String text", 3);
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        // classA.getPrivateMethod("String text");  - error as method is private (ClassA only)
        classA.getPackageMethod("String text",1);
        classA.getProtectedMethod("String text",1);
        classA.getPublicMethod("String text",1);


    }

}
