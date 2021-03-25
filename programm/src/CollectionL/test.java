package CollectionL;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author datefate
 * @site create 2021-03-17-上午9:45
 */
public class test {
    @Test
    public void arrayList(){
        ArrayList<String> array = new ArrayList<>(10);
        System.out.println(array.size());

        array.add("hell");
        array.add("wht");
        array.add("whts");
        array.add("poem");
//        System.out.println(array.size());
//        System.out.println(array.lastIndexOf("poem"));

        array.add(0,"beautiful");
        array.add(1,"hello");
        for (int i = 0; i < array.size();i++) {
            System.out.println(array.get(i));
        }
        System.out.println(array.get(0));

    }
    @Test
    public void arrycopy(){
        Object[] as  =new String[10];
        as[1] = "hello";
        as[2] ="world";
        Object[] es = as;
        for(int i = 0;i<es.length;i++){
            System.out.println(es[i]);
        }
    }

    @Test
    public void instanceoftest(){
        List<String>   l1= new LinkedList<String>();
        List<Integer>   l2 = new LinkedList<Integer>();
        System.out.println(l1 instanceof List);
        System.out.println(l2 instanceof List);

    }

    @Test
    public void test(){
        // 创建一个动态数组
        ArrayList<String> sites = new ArrayList<>();

        sites.add("fuck");
        sites.add("the");
        sites.add("java");

        System.out.println("ArrayList : " + sites.toString());

        // 删除名称中带有 fuck的元素
        sites.removeIf(e -> e.contains("fuck"));
        System.out.println("删除后的 ArrayList: " + sites);
    }
}
