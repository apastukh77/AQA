package logic.jcf.queue;

import java.util.PriorityQueue;

/**
 * @author Serhiy Dubovenko
 */
public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Kiev");
        pq.add("London");
        pq.add("Oslo");
        pq.add("Rio");
        pq.add("New York");

       /* for (int i = 0; i <pq.size() ; i++) {
            System.out.println(pq);
            System.out.println(pq.peek());
        }*/

       /* for (int i = 0; i <pq.size() ; i++) {
         //   System.out.println(pq);
            System.out.println(pq.poll());
        }*/

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }



    }


}
