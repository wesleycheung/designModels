package singleton;

/**
 * @author: wesley
 * @time: 2018/5/1
 * Description:
 */
public class StarveTom {

    private static final Tom teacherTom = new Tom();

    public Tom getTom(){
        return teacherTom;
    }
}
