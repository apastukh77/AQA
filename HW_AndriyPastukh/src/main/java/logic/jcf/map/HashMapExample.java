package logic.jcf.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        ArrayList List = new ArrayList(Arrays.asList("Test", "Test"));


        HashMap<String,Long> hm = new HashMap<>();
        hm.put("Istambul", 15462452L);
        hm.put("Miskow", 15462452L);
        hm.put("London", 15462452L);
        hm.put("San Usel", 15462452L);
        hm.put("Berlin", 15462452L);

        System.out.println(hm);

        hm.putIfAbsent("Berlin", 4000000L);

        System.out.println("Get population of Kiev " + hm.)

    }
}
