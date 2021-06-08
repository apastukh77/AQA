package Shop_33m2.goods;

public class HardDrive extends ElectronicDevice{
    private int volume;

    public HardDrive(String name) {
        super(name);
    }
    public void format (){

    }

    public void copy(){

    }

    public void delete(){

    }

    @Override
    public void on() {
        //specific on of hard drive
    }

    @Override
    public void off() {
        //specific off of hard drive
    }
}
