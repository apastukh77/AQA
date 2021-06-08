package Shop_33m2.interfaces;

public interface VisitorInterface {

    void buy(GoodsInterface goods);
    void returnGoods(GoodsInterface goods);
    String getName();

}
