package BasicDatatype;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author datefate
 * @site create 2020-09-下午3:20
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("/home/lxddlh/Documents/disk.txt"), "UTF-8");
        PrintWriter printWriter = new PrintWriter("out.txt","UTF-8");
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
            printWriter.println(line);

        }
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        printWriter.close();



    }

}

