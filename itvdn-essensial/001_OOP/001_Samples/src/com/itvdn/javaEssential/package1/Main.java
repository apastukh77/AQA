package com.itvdn.javaEssential.package1;

import com.itvdn.javaEssential.package2.ExampleInPackage2;
import com.itvdn.javaEssential.package2.Parent;

/**
 * Created by apastukh
 */
public class Main extends Parent{
    public static void main(String[] args) {
        System.out.println("В конструкторе класса одного и того же пакета видно public, protected и package:");
        ExampleInPackage1 i1 = new ExampleInPackage1();
 //       System.out.println(i1.name1); //private ошибка
        System.out.println(i1.name2); //package
        System.out.println(i1.name3); //protected
        System.out.println(i1.name4); //public
        System.out.println("В конструкторе класса другого пакета видно public:");
        ExampleInPackage2 i2 = new ExampleInPackage2();
  //      System.out.println(i2.name1); //private ошибка
   //     System.out.println(i2.name2); //package ошибка
   //     System.out.println(i2.name3); //protected ошибка
        System.out.println(i2.name4); //public
        System.out.println("В конструкторе родительского класса видно public:");
        Parent p = new Parent();
        //Ошибка для модификатора protected,
        // из-за того что надо создавать конструктор не родительского класса,
        // а дочернего
  //      System.out.println(p.name1); //private ошибка
  //      System.out.println(p.name2); //package ошибка
   //     System.out.println(p.name3); //protected ошибка !!
        System.out.println(p.name4); //public
        System.out.println("В конструкторе дочернего класса видно public и protected:");
        Main p1 = new Main();
        //      System.out.println(p1.name1); //private ошибка
        //      System.out.println(p1.name2); //package ошибка
        System.out.println(p1.name3); //protected
        System.out.println(p1.name4); //public
    }
}
