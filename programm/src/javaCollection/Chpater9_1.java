package javaCollection;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author datefate
 * @site create 2021-03-19-下午2:36
 */
public class Chpater9_1 {


//    iterator.next() 自动指针
    @Test
    public void test1(){
        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("world");
        list.add("！");
        Iterator<String> iterator =list.iterator();
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(iterator.next());
        System.out.println(iterator.next());

//
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }



    @Test
    public void test2() {
        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("world");
        list.add("！");
//    ListIterator 可以双向遍历

        ListIterator<String> listIterator = list.listIterator();
        String old = listIterator.next();
        System.out.println(old);
        System.out.println();

        listIterator.set("fuck the");

        System.out.println(listIterator.previous());
        listIterator.previous();
        listIterator.set("why ");
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


    }
}
