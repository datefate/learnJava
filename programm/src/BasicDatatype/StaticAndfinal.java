package BasicDatatype;

/**
 * @author datefate
 * @site create 2020-09-下午4:17
 */
public class StaticAndfinal {
    private final String name = "Asura";
    private static int id;

    private static int nextid = 0;


    public void setId(int id) {
        StaticAndfinal.id = id;

//        静态变量
        this.nextid++;
    }
}

