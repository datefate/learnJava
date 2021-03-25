package JavaIO;

import java.io.*;

/**
 * @author datefate
 * @site create 2021-03-09-下午8:34
 */
public class Copy {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("wrong args");
            System.exit(1);

        }
        copyfiles(args[0],args[1]);
    }
//    "/winDiskD/D/JAVA-2020/language/programm/Out/readme.txt" "/winDiskD/D/JAVA-2020/language/programm/Out/why.txt"

    private static void copyfiles(String source, String out) throws IOException {
        try(InputStream input = new FileInputStream(source);
            OutputStream output = new FileOutputStream(out)) {
            input.transferTo(output);
            System.out.println("复制成功");
        }
    }
}
