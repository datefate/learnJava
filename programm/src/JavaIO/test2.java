package JavaIO;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author datefate
 * @site create 2021-03-09-下午8:20
 */
public class test2 {

    /*
    InputStream
     */
    @Test
    public void t1() throws IOException {
        try (OutputStream output = new FileOutputStream("./Out/readme.txt")) {
//            覆盖式写入
            output.write("Hello".getBytes("UTF-8")); // Hello
        }
    }

    @Test
    public void t2() throws IOException {
        Path p = Paths.get("/home/lxddlh/Documents/copyFiles");
        if (!Files.exists(p)) {
            Path copyDest = Files.createDirectories(p);
            System.out.println("c");
        }


    }
}
