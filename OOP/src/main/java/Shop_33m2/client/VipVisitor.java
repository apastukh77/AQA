package Shop_33m2.client;

import Shop_33m2.interfaces.GoodsInterface;

public class VipVisitor extends AbstractBaseVisitor {
    private float discount;

    public VipVisitor(float discount) {
        this.discount = discount;
    }
    //private String name; it doesn't need to duplicate it has implemented in the parent class

    @Override
    public void buy(GoodsInterface goods) {
        if (!checkDiscount()){
            //super.buy(GoodsInterface goods);
        }else{
            //buy with discount
        }

    }
    private boolean checkDiscount(){ return discount > 0;}

}
