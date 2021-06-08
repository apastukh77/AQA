package logic.jcf.list;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> List1 = new ArrayList(Array.asList("1","2","3","One"));
        
        ArrayList<String> List2 = new ArrayList();
        ArrayList<String> List3 = new ArrayList(Array.asList("One","Two","Seven"));
        List2.add("One");
        List2.add("One");

        System.out.println("list1: " + List1);
        System.out.println("list2: " + List2);

        List1.addAll(list2);
        System.out.println("list1+list1"+list1);

        list1.add("Two");
        System.out.println("list1: " + List1);
        System.out.println("list3: " + List3);

        System.out.println(list1);

        list1.retainAll(list3);
        System.out.println("list1 retain All: "+list1);

    }
}
