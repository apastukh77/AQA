package logic.priority_of_inheritance;

/**
 * @author Serhiy Dubovenko
 */
public interface InterfaceB {

    default public void print(){
        System.out.println("InterfaceB");
    }
}
