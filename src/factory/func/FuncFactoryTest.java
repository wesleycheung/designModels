package factory.func;

/**
 * @author: wesley
 * @time: 2018/4/29
 * Description:
 */
public class FuncFactoryTest {
    public static void main(String[] args) {

        GoodsFactory factory = new FoodFactory();

        factory.sell();

    }
}
