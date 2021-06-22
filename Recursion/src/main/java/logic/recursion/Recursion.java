package logic.recursion;

/**
 * @author Serhiy Dubovenko
 */
public class Recursion {
     public static void test(int counter) {
        System.out.println(counter);
        if (counter >= 5) { //Точка выхода
            return;
        }

        if (counter < 5) {
            counter++;

            test(counter++);
        } else {
            return;
        }

        //  1 1 2 3 5 8 13 21

    }

    public static void main(String[] args) {
        test(0);
    }
}
