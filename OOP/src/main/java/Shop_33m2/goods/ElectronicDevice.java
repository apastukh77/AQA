package Shop_33m2.goods;

import Shop_33m2.interfaces.ElectronicDeviceInterface;

public class ElectronicDevice extends AbstractBaseGoods implements ElectronicDeviceInterface {

    public ElectronicDevice(String name) {
        super(name);
    }

    @Override
    public void on() {
        //common realization
    }

    @Override
    public void off() {
        //common realization
    }
}
