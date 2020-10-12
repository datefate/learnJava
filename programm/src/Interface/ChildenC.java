package Interface;

/**
 * @author datefate
 * @site create 2020-10-04-下午8:09
 */
public class ChildenC extends SuperC implements SuperInterface {
    ChildenC(){}

    @Override
    public void abstractMethod() {
        System.out.println("子类的因为继承的接口和超类都有必须重写的方法");
    }

    public static void main(String[] args) {
        ChildenC childenC = new ChildenC();
        childenC.abstractMethod();
        childenC.defaultMethod();
    }
}
