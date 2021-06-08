package logic.inheritance_visibility.test;

import logic.inheritance_visibility.src.ClassA;

/**
 * @author Serhiy Dubovenko
 */
public class ClassD {

   /* public void workMethod(){
        getPrivateMethod("String text");
        getPackageMethod("String text",1);           -- Error, the ClassE class is not a child of ClassA
        getProtectedMethod("String text", 2);
        getPublicMethod("String text", 3);
    }*/

    public static void main(String[] args) {
        ClassA classA = new ClassA();
     //   classA.getPrivateMethod("String text");
     //  classA.getPackageMethod("String text",1);
     //  classA.getProtectedMethod("String text",1);
        classA.getPublicMethod("String text",1);
    }

}
