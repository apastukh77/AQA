package logic.priority_of_inheritance;

/**
 * @author Serhiy Dubovenko
 */
public class Runner extends ClassA implements InterfaceB {

    public Runner() {

    }

    @Override
    public void print(){
        System.out.println("Runner");
    }

    public void usePrintFromParentClaaaass() {
     super.print();
    }




    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.print();
        runner.usePrintFromParentClaaaass();
    }
}
