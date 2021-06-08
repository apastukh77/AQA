package logic.inheritance_visibility.src;

/**
 * @author Serhiy Dubovenko
 */
public class ClassE {

   /* public void workMethod(){
        getPrivateMethod("String text");
        getPackageMethod("String text",1);               -- Error, the ClassE class is not a chaild of ClassA
        getProtectedMethod("String text", 2);
        getPublicMethod("String text", 3);
    }*/


    public static void main(String[] args) {
        ClassA classA = new ClassA();
       // classA.getPrivateMethod("String text");  - error as method is private (ClassA only)
        classA.getPackageMethod("String text",1);
        classA.getProtectedMethod("String text",1);
        classA.getPublicMethod("String text",1);
    }


}
