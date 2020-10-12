package Interface;

/**
 * @author datefate
 * @site create 2020-10-04-下午8:08
 */
public interface SuperInterface {
    default public void defaultMethod(){
        System.out.println("这是接口的default方法");
    }

    public abstract void abstractMethod();
}
