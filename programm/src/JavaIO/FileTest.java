package JavaIO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author datefate
 * @site create 2020-11-03-下午7:52
 */
public class FileTest {

    public static void main(String[] args) throws IOException {
        File f  = new File("lxd.txt");

//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getPath());
//        System.out.println(f.exists());
//        System.out.println(f.isFile());
//        System.out.println(f.createNewFile());
//        System.out.println(f.isFile());
//        System.out.println(f.delete());
//        File[] roots  = File.listRoots();
//        System.out.println(roots);
//        for(int i = 0; i<roots.length;i++){
//            System.out.println(roots[i]);
//        }

        File file  = new File("TTT");
        file.createNewFile();



    }

    private static void printdir(File file) {
        File[] dirs = file.listFiles();
        for(File f : dirs){
            if(file.isFile()){
                System.out.println("文件名："+f.getAbsolutePath());
            }else
                System.out.println("目录："+f.getAbsolutePath());
            printdir(f);
        }

    }

    /*
    创建目录
    if dest 存在，则不创建

    mkdir : 创建单一目录
    mkdirs : 创建多级目录
     */
    @Test
    public void createDir() throws IOException {
//        GCG 时被创建出来的目录
        File dest = new File("/home/lxddlh/Documents/SQL/GCG");
        if(dest.mkdir()) {
            System.out.println(dest.getPath());
        }
//        创建多级目录
        File dest2 = new File("/home/lxddlh/Documents/SQL/GCG/GC1/ACG_W");
        if(dest2.mkdirs()) {
            System.out.println(dest2.getPath());
        }


    }
/*
  删除目录
  delete 无法删除多级目录

  删除多级目录 ：listFile
 */
    @Test
    public void deleteDir(){
        File dest = new File("/home/lxddlh/Documents/SQL/GCG");
        File dest2 = new File("/home/lxddlh/Documents/SQL/GCG/GC1/ACG_W");
        if (dest2.delete()) {
            System.out.println("删除目录成功");
            System.out.println(dest);

        }

//        递归函数创建删除多级目录
//        File[] subFiles = dest.listFiles();
//        for (File sub:subFiles){
//            if (sub.isDirectory()) {
//
//
//            }
//        }



    }

    public void copy(){
        File dest = new File("/home/lxddlh/Documents/SQL/shit");
        File dest2 = new File("/home/lxddlh/Documents/SQL/GCG");


    }

    @Test
    public void createFile(){
        File dest = new File("/home/lxddlh/Documents/SQL/");

        String[] get = dest.list();
        System.out.println("");
    }


}
