package logic.jcf.list;

import java.util.Vector;

/**
 * @author Serhiy Dubovenko
 */
public class VectorExample {

    public static void main(String[] args) {
        Vector vItIsVector = new Vector();

        vItIsVector.add("Serhiy1");
        vItIsVector.add("Denis2");
        vItIsVector.add("Kate3");
        vItIsVector.add("Mihail4");

        System.out.println("Collaction: "+ vItIsVector);
        System.out.println("Size: "+vItIsVector.size());
        System.out.println("Capacity"+vItIsVector.capacity());

        Vector vItIsVector2 = new Vector();
        for (int i = 0; i < 1000; i++) {
            vItIsVector2.add(i);
            System.out.println(i+") size: "+vItIsVector2.size()+"; capacity: "+vItIsVector2.capacity()+";");
        }



    }
}
