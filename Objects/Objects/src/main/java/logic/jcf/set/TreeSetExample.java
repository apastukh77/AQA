package logic.jcf.set;

import java.util.TreeSet;

/**
 * @author Serhiy Dubovenko
 */
public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("Kiev");
        tree.add("New York");
        tree.add("New York");
        tree.add("Oslo");
        tree.add("Rio");
        tree.add("Madrid");
        tree.add("Milan");
        tree.add("Brno");
        tree.add("Stockholm");
        System.out.println(tree);


        // {35, 8, 14, 31,72, 54, 55, 27, 17, 4, 11, 44, 35,37, 35, 24}
    }

}
