package BasicDatatype;

/**
 * @author datefate
 * @site create 2020-09-下午4:17
 */
public class StaticAndfinal {
    private final String name = "Asura";
    private static int id = 0;
    private int idS ;

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public int getIdS() {
        return idS;
    }

    StaticAndfinal(int idS){
        id++;
        this.idS = idS;

    }

}

