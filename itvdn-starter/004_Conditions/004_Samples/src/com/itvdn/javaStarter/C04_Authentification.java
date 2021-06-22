package com.itvdn.javaStarter;

import java.util.Scanner;

public class C04_Authentification {
    public static void main(String[] args) {
        String login = "apastukh";
        String password = "P@ssw0rd";
        // На 10 строке создаём объект класса Scanner для обработки ввода с клавиатуры
        Scanner scr = new Scanner(System.in);

        System.out.print("Введите login: ");

        // На 17 строке создаем строкову локальную переменную с именем usersLogin
        // и принимаем в нее ввод от пользователя

        String usersLogin = scr.next();

        if (login.equals(usersLogin)) {
            System.out.print("Введите password: ");
            String usersPassword = scr.next();

            if (password.equals(usersPassword)) {
                System.out.println("Здравствуйте " + usersLogin + ", Вы вошли в систему.");
            } else {
                System.out.println("Вы ввели неверный пароль!");
            }
        } else {
            System.out.println("Нет пользователя с таким именем!");
        }
    }
}
