package factory;
/**
 * @author: wesley
 * @time: 2018/4/29
 * Description:
 */
public class Clothes implements Goods {

    @Override
    public void forSell() {
        System.out.printf("U are buying some clothes");
    }
    @Override
    public  void getName(){
        System.out.printf("Clothes");
    }
}
