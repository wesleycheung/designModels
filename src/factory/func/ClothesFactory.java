package factory.func;

import factory.Clothes;
import factory.Goods;

/**
 * @author: wesley
 * @time: 2018/4/29
 * Description:
 */
public class ClothesFactory implements GoodsFactory {
    @Override
    public void sell() {
        Clothes clothes =new Clothes();
        clothes.forSell();
    }

    @Override
    public Goods getGoods() {
        return  new Clothes();
    }
}
