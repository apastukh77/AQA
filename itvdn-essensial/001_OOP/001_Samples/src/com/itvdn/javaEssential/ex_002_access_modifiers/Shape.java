package com.itvdn.javaEssential.ex_002_access_modifiers;

public class Shape {

    private int length;
    private long height;
    public double square;
    public float f;
    public char c;
    public boolean bull;

    public Shape() {
        //Коструктор без параметров предназначен для того,
        // что бы мы в переспективе создать обьект ( или экземпляр = обьект) класса
    }

    public int getLength() {
        return length;
    }//getters возвращают значения

    public void setLength(int length) {
        this.length = length;
    } //setters присваивают значения

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void viewShape() {
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
    }
}
