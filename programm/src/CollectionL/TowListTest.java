package CollectionL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList 广义表实现，内部调整数组大小
 *
 *  ＬｉｎｋＬｉｓｔ　链表实现
 *
 * 通过Iterator遍历List通常是高效的方式，对于ＡｒｒａyList 实现来说
 * 线性数组直接通过ｇｅｔ() 来获取最快
 * @author datefate
 * @site create 2020-10-20-上午11:18
 */
public class TowListTest {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add(null);
        s.add("cnm");

        List<String> linkList = new LinkedList<>();
        linkList.add(null);
        Integer integer = 100;
        linkList.add(integer.toString());
//
//        Iterator<String> stringIterator = linkList.iterator();
//        while (stringIterator.hasNext()) {
//            String gets  = stringIterator.next();
//            System.out.println(gets);
//
//        }
//
//        for(Iterator<String> fortest = s.iterator();fortest.hasNext();){
//            String ge = fortest.next();
//            System.out.println(ge);
//        }
//      foreach 打印实现了　Ｉｔｅｒａｂｌｅ 接口的类
        for(String g : linkList){
            System.out.println(g);
        }


      /*  3种方法ｌｉｓｔ　转换为　Ａｒｒａｙ
        */


//        toArray(T [] )
        List<Integer> list = List.of(1,100,232);
        Integer[] arr = list.toArray(new Integer[list.size()]);
        System.out.println("array:");
        for(Integer integer1 :arr){

            System.out.println(integer1);
        }

//        验证是否可以添加重复元素
        System.out.println("s的大小："+ s.size());
        s.add(null);
        s.add("cnm");
        for (String integer1:s ) {
            System.out.println(integer1);
        }
        System.out.println(s.size());
        System.out.println(list.getClass());
        System.out.println(linkList.getClass());

//

    }
}
