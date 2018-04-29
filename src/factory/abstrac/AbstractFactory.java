package factory.abstrac;

import factory.Goods;

/**
 * @author: wesley
 * @time: 2018/4/29
 * Description:
 */
public abstract  class AbstractFactory {

    public abstract Goods getFood();

    public abstract Goods getClothes();
}
