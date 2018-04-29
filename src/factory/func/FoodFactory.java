package factory.func;

import factory.Food;
import factory.Goods;

/**
 * @author: wesley
 * @time: 2018/4/29
 * Description:
 */
public class FoodFactory implements GoodsFactory {
    @Override
    public void sell() {
        Food food = new Food();
        food.forSell();

    }

    @Override
    public Goods getGoods() {
        return  new Food();
    }
}
