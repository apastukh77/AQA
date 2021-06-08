package logic.jcf.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author Serhiy Dubovenko
 */
public class LinkedHashMapExample {


        public static void main(String[] args) {

            LinkedHashMap hm = new LinkedHashMap();
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
