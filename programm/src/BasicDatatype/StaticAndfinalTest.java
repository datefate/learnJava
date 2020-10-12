package BasicDatatype;

import edu.princeton.cs.algs4.StdOut;
/**
 * @author datefate
 * @site create 2020-09-下午4:23
 */
public class StaticAndfinalTest {
    public static void main(String[] args) {
    StaticAndfinal[] staff = new StaticAndfinal[3];
    staff[0] = new StaticAndfinal(1);
    staff[1] = new StaticAndfinal(2);
        StdOut.println(staff[1].getName());
        StdOut.println(StaticAndfinal.getId());

    }
}
