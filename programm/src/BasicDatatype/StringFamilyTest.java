package BasicDatatype;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author datefate
 * @site create 2020-09-下午9:07
 */
public class StringFamilyTest {
    public static void main(String[] args) {
//        var sb = new StringBuffer();
//        sb.append("date")
//                .append("fate")
//                .insert(1,"Oh no");
//        System.out.println(sb);
//        String[] names = {"Bob","cnm" ,"Alice", "Grace"};
////        指定分隔符，开头和结尾
//        var sj = new StringJoiner(", ", "Hello ", "!");
//        for (String name : names) {
//            sj.add(name);
//        }
//        System.out.println(sj.toString());

        Integer s = Integer.valueOf(123);
        Integer k = 123;
        Integer q = 123;
        Integer u = Integer.valueOf(123);
        StdOut.println("s.equals(k):"+s.equals(k));
        StdOut.println("s == k:"+(s == k));
        StdOut.println("k = q:"+(k==q));

    }

}
