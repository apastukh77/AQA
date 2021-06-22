package com.itvdn.javaEssential.ex_001_class_declaration;

// Объявление класса (поля, конструктор, методы)

public class Car {

    private String model;
    private int maxSpeed;
    private int year;
    private int speed;

    public Car() {
    }

    public Car(String model, int maxSpeed, int year, int speed) {
        //конструктор (создает экземпляр класса(копии класса))
        //с инициализированными переменными
        this.model = model;//this - ссылка на текущий обьект
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.speed = speed;
    }
//методы доступа getters и setters нужны только для скрытых полей, для public полей ненужны:
    public int getMaxSpeed() {
        return maxSpeed;
    }
    //метод set для того что бы присвоить значение полю maxSpeed
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
