package logic.jcf.list;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author Serhiy Dubovenko
 */
public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Serhiy");
        ll.add("Denis");
        ll.add("Kate");
        ll.add("Mihail");
        System.out.println(ll);

        ll.addFirst("Georgii");

        ll.addLast("Juan");
        System.out.println(ll);

        ll.add(3,"Rahul");
        System.out.println(ll);




    }

}
