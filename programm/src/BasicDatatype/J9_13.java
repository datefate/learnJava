package BasicDatatype;
import edu.princeton.cs.algs4.StdOut;
/**
 * @author datefate
 * @site create 2020-09-下午2:51
 * Idea ubuntu 下setting开启自动编译后，运行依旧无法重新编译，ctrl+ B解决
 */
public class J9_13 {
    public static void main(String[] args){
//        String dir = System.getProperty("user.dir");
//        StdOut.println(dir);
        String s = "";
        StdOut.println("s.length:"+ s.length());
        int[] array = new int[10];
        StdOut.println("only defined array.length:"+ array.length);
        array[0] = 10;
        StdOut.println("array[0] get num,array.length:"+array.length);
    }
}

