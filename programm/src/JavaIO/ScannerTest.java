package JavaIO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author datefate
 * @site create 2020-12-01-下午8:36
 */
public class ScannerTest {



    @Test
    public void test1(){

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

    }

    @Test
    public void test2()throws IOException {
        Scanner sc = new Scanner(new File("/winDiskD/D/JAVA-2020/language/src/algs/readme.txt"));
        while (sc.hasNext()) {
            String s = sc.next();
            System.out.println(s);
        }
    }


}
