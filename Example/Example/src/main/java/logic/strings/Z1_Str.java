package logic.strings;

//import sun.plugin.javascript.navig.Document;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Currency;

/**
 * @author Serhiy Dubovenko
 */
public class Z1_Str {

    /*
         Над ним не было ничего уже, кроме неба, - высокого неба, не ясного, но все-таки неизмеримо высокого,
         с тихо ползущими по нём серыми облаками. "Как тихо, спокойно и торжественно, совсем не так, как я бежал,
         - подумал князь Андрей, - не так, как мы бежали, кричали и дрались, совсем не так, как с озлобленными и
         испуганными лицами тащили друг у друга банник француз и артиллерист, - совсем не так ползут облака по этому
         высокому бесконечному небу. Как же я не видал прежде этого высокого неба? И как я счастлив, что узнал его наконец.
         Да! Все пустое, все обман, кроме этого бесконечного неба. Ничего, ничего нет, кроме его. Но и того даже нет, ничего
         нет, кроме тишины, успокоения. И слава богу!
     */

    public static void main(String[] args) {



        // Входной текст
        String text = "Над ним не было ничего уже, кроме неба, - высокого неба, не ясного, но все-таки неизмеримо высокого," +
                " с тихо ползущими по нём серыми облаками. \"Как тихо, спокойно и торжественно, совсем не так, как я бежал\"," +
                " - подумал князь Андрей, - не так, как мы бежали, кричали и дрались, совсем не так, как с озлобленными и" +
                " испуганными лицами тащили друг у друга банник француз и артиллерист, - совсем не так ползут облака по этому" +
                " высокому бесконечному небу. Как же я не видал прежде этого высокого неба? И как я счастлив, что узнал его наконец." +
                " Да! Все пустое, все обман, кроме этого бесконечного неба. Ничего, ничего нет, кроме его. Но и того даже нет, ничего" +
                " нет, кроме тишины, успокоения. И слава богу!";



        // объявляем коллекцию содержащую результат
        ArrayList<CharInfo> list = new ArrayList<CharInfo>();


        for (int i = 0; i < text.length(); i++) {               // цикл расчета повторения символов
            int counter = 0;                                    // счетчик повторений символов
            boolean unique = false;                             // флаг уникальности єлемента в результирующей коллекции

            for (int j = 0; j < text.length(); j++) {           // расчет количества
                if (text.charAt(i) == text.charAt(j)) {
                    counter++;
                }
            }



            for (int k = 0; k < list.size(); k++) {                 // проверка уникальности значения в результатах
                if (list.get(k).getCharacter() == text.charAt(i)) {
                    unique = true;
                }
            }
            if (unique == false) {
                list.add(new CharInfo(text.charAt(i), counter, ((double) counter / text.length() * 100))); // добавление уникального элемента
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("###0.00");   // объявление формата для чисел с плавающей точкой (процентных значений)

        for (CharInfo info : list) {
            System.out.println(info.getCharacter() + ": " + info.getCount() + "; " + decimalFormat.format(info.getPercent())); // вывод ответа в консоль
        }

    }

}
