package com.itvdn.javaStarter;

public class C07_DoWhileContinue {
    // Циклическая конструкция - do-while. (с пропуском итерации - continue)

    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);

            if (true) continue;//выкидывает на проверку while  минуя код после себя в теле цикла

            System.out.println("Эта строка не выполнится.");
        } while (counter < 3);

        System.out.println("Произведено " + counter + " итераций.");
    }
}
