package logic.jcf.map;

import java.util.Hashtable;

/**
 * @author Serhiy Dubovenko
 */
public class HashTableExample {


    public static void main(String[] args) {

        Hashtable<String, Long> ht = new Hashtable();
        ht.put("Istanbul", 15462452L);
        ht.put("Moscow", 12195221L);
        ht.put("London",9126366L);
        ht.put("Saint Petersburg", 5383890L);
        ht.put("Berlin", 3748148L);

        System.out.println(ht);

    }

}
