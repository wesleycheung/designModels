package factory.func;

import factory.Goods;

/**
 * @author: wesley
 * @time: 2018/4/29
 * Description:
 */
public interface GoodsFactory {
    public void sell();

    public Goods getGoods();
}
