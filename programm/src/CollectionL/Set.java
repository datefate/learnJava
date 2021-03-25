package CollectionL;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *set 无法添加重复的元素
 * Hashset 是无序的,既不是输入顺序，也不是String 的排序
 * TreeSet 是有序的,必须实现Comparable接口，否则传入Comparator 对象
 * @author datefate
 * @site create 2020-11-01-下午7:18
 */
public class Set {
    public static void main(String[] args) {


        //HashSet
        java.util.Set<String> hashset  = new HashSet<>();
        hashset.add("cnm");
        hashset.add("Asura");
        hashset.add("OK");
        for (String s : hashset) {
            System.out.println(s);

        }

        // TreeSet
        System.out.println("____________________________________");
        java.util.Set<Integer> treeset = new TreeSet<>();
        treeset.add(12);
        treeset.add(new Integer(121));
        treeset.add(new Integer(12));// false
        for(Integer integer: treeset){
            System.out.println(integer.toString());
        }


//        SortedSet<String> sortedSet = new
    }
}
