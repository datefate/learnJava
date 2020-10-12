package BasicDatatype;

/**
 * 不能去依靠"==" 做判断
 * @author datefate
 * @site create 2020-09-下午8:37
 */
public class IntergerTest {
    public static void main(String[] args) {
//        Integer x = 127;
//        Integer y = 127;
//        Integer m = 99999;
//        Integer n = 99999;
//        System.out.println("x == y: " + (x==y)); // true
//        System.out.println("m == n: " + (m==n)); // false
//        System.out.println("x.equals(y): " + x.equals(y)); // true
//        System.out.println("m.equals(n): " + m.equals(n)); // true

        String string = "100";
        System.out.println("100的0x："+Integer.toHexString(100));
        System.out.println("100的0x："+Integer.toOctalString(100));
        Integer s = Integer.parseInt(string,8);
        System.out.println("After transfrom to 0x:"+s);
        int add = s + 0x10;
        System.out.println(add);
        /*
        100的0x：64
100的0x：144
After transfrom to 0x:64
80
         */
    }
}
