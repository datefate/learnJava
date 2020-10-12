package BasicDatatype;

import java.util.*;

/**
 * values() 返回枚举类中所有的值。
 * ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
 * valueOf()方法返回指定字符串值的枚举常量。
 * @author datefate
 * @site create 2020-09-16$-{TIME}
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter a size :(SMALL MEDIUM,LARGE)");
        String input = s.next().toUpperCase();//转大写
        Size size = Enum.valueOf(Size.class,input);
        for(Size test:Size.values())
            System.out.println("emm:"+test);
        System.out.println("size = "+size);
        System.out.println("whf = "+size.getWhf());
        anther anther = BasicDatatype.anther.winter;
        System.out.println(anther);


    }
}


enum anther{
    spring,winter,summer;
}
enum Size{
    SMALL(1,"S"),MEDIUM(2,"M"),LAGRE(3,"L");

    private String whf;
    private int Sizevalue;
    private Size(int sizevalue,String kul){
        System.out.println("调用了该枚举的构造函数："+this.toString());
        this.whf =kul;
        this.Sizevalue = sizevalue;

    }

    public String getWhf() {
        return whf;
    }

    @Override
    public String toString(){
        return this.whf;
    }
}
