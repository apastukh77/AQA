package com.itvdn.javaEssential.ex_002_access_modifiers;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();

        shape.square = 24.0; // доступ к public полю
        System.out.println(shape.square);
        //shape.f = 3.7f;
        System.out.println(shape.f);//без присвоения значения - выводит 0.0
        //shape.c = 'a';
        System.out.println(shape.c);//без присвоения значения - выводит \u0000
        //это управляющий символ (null character) из таблицы ASCII
        //shape.bull = true;
        System.out.println(shape.bull); //без присвоения значения - выводит false
        //задаем параметры нашему объекту

        shape.setHeight(200);
        shape.getHeight();

        shape.setLength(144);
        shape.getLength();

        // выводим объект через метод

        shape.viewShape();
    }
}
