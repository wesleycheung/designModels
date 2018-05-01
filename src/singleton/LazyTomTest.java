package singleton;

/**
 * @author: wesley
 * @time: 2018/4/30
 * Description:
 */
public class LazyTomTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200000000;i ++) {
            Object obj = LazyTom.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }
}
