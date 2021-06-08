package logic.jcf.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Serhiy Dubovenko
 */
public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.add("Kiev");
        hs.add("New York");
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
