package logic.jcf.list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Serhiy Dubovenko
 */
public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String > list1 = new ArrayList(Arrays.asList("1", "2", "3", "One"));

        ArrayList<String > list2 = new ArrayList();
        ArrayList<String > list3 = new ArrayList(Arrays.asList("One", "Two", "Seven"));
        list2.add("One");
        list2.add("One");

        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);


        list1.addAll(list2);
        System.out.println("list1+list1"+list1);

        list1.add("Two");
        System.out.println("list1"+list1);
        System.out.println("list3"+list3);

       // list1.removeAll(list3);
        System.out.println(list1);

        list1.retainAll(list3);
        System.out.println("list1 retain All: "+list1);

        list1.set(1,"five");
        System.out.println(list1);

        System.out.println(list1.get(1));


        System.out.printf("ArrayList has %d elements \n", list1.size());

            for(String lt1 : list1){
                System.out.println("ArrayList Has: "+lt1);
            }

            if(list1.contains("five")){
                System.out.println("ArrayList contains \"five\"");
            }

            Object[] listArray = list1.toArray();
            for(Object lt1 : listArray){
                System.out.println(lt1);

            }

            String l = "";
            for (int i = 0; i < list1.size(); i++){
                l = l + list1.get(i) + " ";
            }

        System.out.println(l);
    }



}
