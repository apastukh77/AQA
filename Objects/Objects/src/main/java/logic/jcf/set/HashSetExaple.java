package logic.jcf.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Serhiy Dubovenko
 */
public class HashSetExaple {

    public static void main(String[] args) {
        // Коллекция


        HashSet<String> hs = new HashSet<>();
        hs.add("Kiev");
        hs.add("New York");
        hs.add("Oslo");
        hs.add("Rio");
        hs.add("Madrid");
        hs.add("Milan");
        hs.add("Brno");
        hs.add("Stockholm");
        System.out.println(hs);


        Iterator it = hs.iterator();
        while (it.hasNext()){
            String city = it.next().toString();
            System.out.println("City: "+city);
            System.out.println("Next Iterator object: "+ it.next());
        }

    }
}
