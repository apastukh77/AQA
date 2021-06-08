package Shop_33m2.goods;

public class Televisor extends ElectronicDevice{

    public Televisor(int i, boolean b, String smartTV, String name) {
        super(name);
    }

    public void selectChannel(){
        System.out.println("Select channel");
    }
}
