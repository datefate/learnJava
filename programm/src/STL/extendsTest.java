package STL;

/**
 * @author datefate
 * @site create 2020-10-18-上午11:14
 */
public class extendsTest {
    public static void main(String[] args) {
        Start<String,Integer> p = new Start<>("wyd",23);
        add(p);

    }

    static String add(Start<String,? extends Number> p){
        String first = p.getName();
        Number sec = p.getNum();
        p.setName(new String("wyd"));
//        p.setNum(new Integer(100));
        return p.getName()+p.getName();

    }
}
