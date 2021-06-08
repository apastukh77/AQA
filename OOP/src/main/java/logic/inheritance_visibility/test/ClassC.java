package logic.inheritance_visibility.test;

import logic.inheritance_visibility.src.ClassA;

/**
 * @author Serhiy Dubovenko
 */
public class ClassC extends ClassA {

    public void workMethod(){
       // getPrivateMethod("String text");  - error as method is private (ClassA only)
      //    getPackageMethod("String text",1);  - error as method is package (should be in one package with CLassA)
        getProtectedMethod("String text", 2);
        getPublicMethod("String text", 3);
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
      //  classA.getPrivateMethod("String text");  - error as method is private (ClassA only)
      //  classA.getPackageMethod("String text",1); - error as method is package (should be in one package with CLassA)
      //  classA.getProtectedMethod("String text",1); - error as method is protected (access denided for objects)
        classA.getPublicMethod("String text",1);
    }


}
