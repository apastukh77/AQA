package Shop_33m2.client;

import Shop_33m2.goods.Televisor;
import Shop_33m2.interfaces.GoodsInterface;
import Shop_33m2.interfaces.VisitorInterface;

public abstract class AbstractBaseVisitor implements VisitorInterface {
    private String name;

    @Override
    public void buy(GoodsInterface goods) {
        System.out.println(goods.getName());
            //instanceof - check of actual object
        if(goods instanceof Televisor)
            ((Televisor)goods).selectChannel();
    }

    @Override
    public void returnGoods(GoodsInterface goods) {

    }

    @Override
    public String getName() {
        return name;
    }

}
