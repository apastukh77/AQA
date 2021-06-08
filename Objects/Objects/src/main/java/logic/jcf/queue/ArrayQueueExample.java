package logic.jcf.queue;

import com.sun.jmx.remote.internal.ArrayQueue;

/**
 * @author Serhiy Dubovenko
 */
public class ArrayQueueExample {

    public static void main(String[] args) {
        ArrayQueue<String> aq = new ArrayQueue(3);
        aq.add("Kiev");
        aq.add("London");
        aq.add("Oslo");


        System.out.println(aq);
        System.out.println(aq.size());


        aq.remove(0);
        System.out.println(aq);
        System.out.println(aq.size());

    }

}
