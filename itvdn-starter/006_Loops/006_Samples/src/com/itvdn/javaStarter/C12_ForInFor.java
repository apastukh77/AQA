package com.itvdn.javaStarter;

public class C12_ForInFor {
    // Цикл for вложенный в цикл for. ( Построение квадрата из звездочек - * )

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            // Выводим одну строку из 9 звездочек.
            for (int j = 0; j < 10; j++) { //вложенный цикл
                System.out.print("\uD83E\uDD23");
            }

            // Переход на новую строку.
            System.out.println();
        }
    }
}
