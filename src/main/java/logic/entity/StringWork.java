package logic.entity;

import java.nio.charset.StandardCharsets;

import java.util.Locale;

public class StringWork {
    public static void main(String[] args) {

        String str = "Hello Word"; //Обявление переменной в легкоссылочном виде
        System.out.println("Hello Word".getBytes(StandardCharsets.UTF_8));
        System.out.println("Hello Word".toUpperCase());
        System.out.println("Hello Java!!".concat(" The best!"));
        String str1 = new String("Hello Word!"); // Обявление переменной с использованием конструктора
        System.out.println(str);
        System.out.println(str1);

        String text = "\tIntelliJ IDEA provides multiple ways to generate common code constructs and recurring elements, which helps you increase productivity.\nThese can be either file templates used when creating a new file, custom or predefined live templates\n"+ "that are applied differently based on the context, various wrappers, or automatic pairing of characters.";
        System.out.println(text);

        char ch1 = text.charAt(0);
        System.out.println("Буква 0 индекса это: " + ch1);
        char ch2 = text.charAt(1);
        System.out.println("Буква 0 индекса это: " + ch2);
        char ch3 = text.charAt(2);
        System.out.println("Буква 0 индекса это: " + ch3);
        char ch4 = text.charAt(3);
        System.out.println("Буква 0 индекса это: " + ch4);
        char ch5 = text.charAt(4);
        System.out.println("Буква 0 индекса это: " + ch5);
        char ch6 = text.charAt(5);
        System.out.println("Буква 0 индекса это: " + ch6);

        System.out.println("Java".charAt(2));

        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("Емкость: " + strBuffer.capacity());

        strBuffer.ensureCapacity(32);
        System.out.println("Емкость новая: " + strBuffer.capacity());

        System.out.println("Длинна строки: "+ strBuffer.length());

        System.out.println(strBuffer.toString()); //string that reserved in buffer

        StringBuilder strBuilder = new StringBuilder(str);
        System.out.println("Емкость: " + strBuilder.capacity());

StringBuilder sb1 = new StringBuilder(text);
        StringBuilder sb2 = new StringBuilder(text);
        System.out.println("1: "+(sb1.toString()==sb2.toString()));
        System.out.println("2: "+(sb2.equals(sb1)));
        System.out.println("3: "+(sb1.toString().equals(sb2.toString())));


        String str3 = "data";
        String str4 = "data";

        System.out.println("4: " + (str3 == str4));
        System.out.println("5: " + (str4.equals(str3)));


    }
}
