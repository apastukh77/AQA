package hw;

import java.util.ArrayList;
import java.util.Arrays;

public class HW_2_ArrayList {

    public static void main(String[] args) {

    ArrayList <String> elements1 = new ArrayList(Arrays.asList("mobidev","trackensure", "phphanter", "gfl", "brightech", "templetemonster", "peapod"));
    ArrayList <String> elements2 = new ArrayList(Arrays.asList("gfl", "templetemonster", "globallogic", "phphanter", "trackensure"));

        System.out.println("Первая коллекция: " + elements1);
        System.out.println("Вторая коллекция: " + elements2);

        System.out.println("================================");
    for(int i = 0; i < elements1.size(); i++){
        for(int j = 0; j < elements2.size(); j++){
            if(elements1.get(i).equals(elements2.get(j)) == true){
                System.out.println("Элемент " + i +
                        " первой коллекции равен элементу " + j + " второй коллекции, а именно: "+ elements1.get(i)+".");

                }
            }
        }
        System.out.println("================================");
    }
}