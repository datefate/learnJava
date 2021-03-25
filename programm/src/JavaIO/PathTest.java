package JavaIO;

import org.junit.Test;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author datefate
 * @site create 2021-03-09-下午7:10
 */
public class PathTest {
    @Test
    public void test1(){
        URI uri = URI.create("/home/lxddlh/Documents/SQL");

        Path p = Paths.get(uri);
        System.out.println(p);
//        File f = p.toFile();
//        System.out.println(f.getAbsoluteFile());
//        Path p2 = p.getParent();
//        String s= p2.toString();
//        System.out.println(s);
    }

}
