package factory.abstrac;

import factory.Clothes;
import factory.Food;
import factory.Goods;


/**
 * @author: wesley
 * @time: 2018/4/29
 * Description:
 */
public class GoodsFactory extends   AbstractFactory {
    @Override
    public Goods getFood() {
        return new Food();
    }

    @Override
    public Goods getClothes() {
        return new Clothes();
    }
}
