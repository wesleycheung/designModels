package factory;

/**
 * @author: wesley
 * @time: 2018/4/29
 * Description:
 */
public class Food implements Goods {
    @Override
    public void forSell() {
        System.out.printf("U are buying some foods");
    }
    @Override
    public  void getName(){
        System.out.printf("food");
    }

}
