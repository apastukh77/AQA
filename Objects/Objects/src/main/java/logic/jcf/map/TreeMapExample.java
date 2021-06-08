package logic.jcf.map;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author Serhiy Dubovenko
 */
public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<String, Long> hm = new TreeMap<>();
        hm.put("Istanbul", 15462452L);
        hm.put("Moscow", 12195221L);
        hm.put("London",9126366L);
        hm.put("Saint Petersburg", 5383890L);
        hm.put("Berlin", 3748148L);
        hm.put("", null);
        System.out.println(hm);

    }

}
