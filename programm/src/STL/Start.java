package STL;

/**
 * @author datefate
 * @site create 2020-10-13-下午10:50
 */
public class Start<T,K> {
    private T name;
    private K num;

    public T getName() {
        return name;
    }

    public K getNum() {
        return num;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setNum(K num) {
        this.num = num;
    }

    Start(T Key, K value){
        this.name = Key;
        this.num = value;
    }

    public static void out(Start<String,Integer> p){
        String s =p.getName();
        Integer integer = p.getNum();
        System.out.println(s + ":"+integer);

    }



    public static void main(String[] args) {
        Start<String, Integer> p = new Start<>("lxd",22);
        out(p);
    }
}

class StartInt extends Start<Integer,String>{

    StartInt(Integer Key, String value) {
        super(Key, value);
    }
}
