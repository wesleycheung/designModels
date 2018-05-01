package singleton;

import java.io.Serializable;

/**
 * @author: wesley
 * @time: 2018/4/30
 * Description:
 */
public class LazyTom implements Serializable{

   private LazyTom(){};

   private static class  LazyTomeBuilder{

       private static Tom lazyTom = new Tom();
   }

   public static Tom getInstance(){
       return LazyTomeBuilder.lazyTom;
   }

   private Object readResolve(){
       return LazyTomeBuilder.lazyTom;
   }
}
