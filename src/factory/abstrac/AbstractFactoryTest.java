package factory.abstrac;

import factory.Goods;

/**
 * @author: wesley
 * @time: 2018/4/29
 * Description:
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {

        GoodsFactory goodsFactory = new GoodsFactory();
        Goods clothes = goodsFactory.getClothes();
        clothes.forSell();
    }
}
