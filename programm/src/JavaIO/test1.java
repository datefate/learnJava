package JavaIO;

import java.io.*;

/**
 * File 类
 * @author datefate
 * @site create 2020-11-10-下午4:23
 */
public class test1 {
    public static void main(String[] args) throws IOException {
//        method2();
//        File fie = new File("/winDiskD/D/Graduate/results/ACC");
//        method2();
//        method3(fie);

        byte[] data = { 72, 101, 108, 108, 111, 33 };
        try (InputStream input = new ByteArrayInputStream(data)) {
            String s = readAsString(input);
            System.out.println(s);
        }
    }


    public void method1() throws IOException {
        InputStream input = new FileInputStream("/home/lxddlh/Documents/connec.sh");
        for (; ; ) {
            int n = input.read();
            if (n == -1) {
                break;//
            }
            System.out.println(n);
        }

        input.close();
    }

    /*
     *read 具有不同的实现
     * x.read（byte）从此输入流x 最多读 b.length字节数组到byte 数组中
     */
    public static void method2() throws IOException {
        try (InputStream input = new FileInputStream("/home/lxddlh/Documents/connect.sh")) {
            byte[] bytes = new byte[10];
            int n = 0;
            while ((n = input.read(bytes)) != -1) {
                System.out.println("read " + n + "bytes");
                System.out.println("********************************");
                for (int i = 0; i < bytes.length; i++) {
                    System.out.print(bytes[i] + "    ...   ");
                }
            }
        }


    }

    /*
     * 遍历文件及其子目录
     */
    public static void method3(File file) {
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + ":is file");
        } else {
            System.out.println(file.getAbsolutePath() + ":is Dictory");
            File[] get = file.listFiles();//获取当前文件夹下的目录和文件
            if (get != null && file.length() > 0) {
                for (File s : get) {
                    method3(s);
                }
            }


        }
    }

    public static String readAsString(InputStream input) throws IOException {
        int n;
        StringBuilder sb = new StringBuilder();
        while ((n = input.read()) != -1) {
            sb.append((char) n);
        }
        return sb.toString();
    }
}
