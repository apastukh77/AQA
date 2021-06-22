package com.itvdn.javaEssential.ex_005_what_is_null;

import com.itvdn.javaEssential.ex_004_method_calling.Car;

public class MyClass {
    public static void main(String[] args) {

        String st1 = null;    // можно стрингу присвоить нал (String - обьект ссылочного типа)
        Car car1 = null;      // можно экземпляру класса присвоить нал
        // int i = null;      // нельзя в примитивный тип впихнуть нал
        Integer i2 = null;

        String str2 = (String) null; // Нал поддается кастованию в другие типы
        Car car2 = (Car) null;

        System.out.println(null == null);      // true
        System.out.println(car1 == null);      // true
       // System.out.println(str2.equals(null)); //ошибка - никакие действия над null нельзя совершать

        //car1.getMaxSpeed(); // NullPointerException (RuntimeException)
        // car1 записанный как null - теряется ссылка
    }
}
