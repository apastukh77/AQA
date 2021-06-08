package logic.jcf.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author Serhiy Dubovenko
 */
public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Long> hm = new HashMap<>();
        hm.put("Istanbul", 15462452L);
        hm.put("Moscow", 12195221L);
        hm.put("London",9126366L);
        hm.put("Saint Petersburg", 5383890L);
        hm.put("Berlin", 3748148L);


        System.out.println(hm);

        hm.putIfAbsent("Berlin", 4000000L);
        hm.put(null, 3748148L);

        System.out.println(hm);
        hm.putIfAbsent("Kiev", 2700000L);
        hm.putIfAbsent("Kiev", 3700000L);
        System.out.println(hm);


        System.out.println("Get population of Kiev: "+hm.get("Kiev"));
    }
}
