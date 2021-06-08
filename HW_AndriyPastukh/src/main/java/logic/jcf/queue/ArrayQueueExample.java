package logic.jcf.queue;

import java.util.Queue;

public class ArrayQueueExample {

    public static void main(String[] args) {

        ArrayQueue <String> aq = new ArrayQueue<>(3); //Value of string
        aq.add("Kiev");
        aq.add("London");
        aq.add(null); //can set null

        //System.out.println(aq);
        System.out.println(aq.size());

        aq.remove(2);
        //System.out.println(aq);
        System.out.println(aq.size());


    }
}
