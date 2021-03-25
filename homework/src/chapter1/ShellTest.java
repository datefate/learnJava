package chapter1;

import edu.princeton.cs.algs4.Shell;

/**
 * Shell 类只接受实现了comparable接口的类对象
 * @author datefate
 * @site create 2020-10-08-上午10:25
 */
public class ShellTest {
    public static void main(String[] args) {
        Integer[] a= {3,1,2,8,7,5,9,2};
        Shell.sort(a);
//        for(Integer integer:a){
//            System.out.println(a);
//        }

        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
