package BasicDatatype;

/**
 * @author datefate
 * @site create 2020-09-18-上午9:41
 */
public interface Person {
    String getName();

    default void run(){
        System.out.println(getName()+"from RUN");
    }

}
