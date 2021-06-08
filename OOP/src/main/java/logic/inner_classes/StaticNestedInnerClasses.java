package logic.inner_classes;

import logic.inheritance_visibility.src.ClassA;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Serhiy Dubovenko
 */
public class StaticNestedInnerClasses {
    private String className;

    private static String CLASS_NAME;

    public void print(String text){
        System.out.println("NestedInnerClasses");
    }

    {
        int j = 20;   // кнструкция 1: не статический блок
    }

    int r  = getText();


    static {
        int i = 10;   // кнструкция 1: статический блок ^_^
    }

    int getText(){
        return 6;
    }


    static class StaticExample{
        private String classNameStaticExample;

        private static String CLASS_NAME_2;

        public void printStaticExample(String text){
            System.out.println("NestedInnerClasses");
        }
    }

    public static void main(String[] args) {
        StaticNestedInnerClasses sniClass = new StaticNestedInnerClasses();
        System.out.println(StaticExample.CLASS_NAME_2);

        StaticExample st = new StaticExample();
    }

}
