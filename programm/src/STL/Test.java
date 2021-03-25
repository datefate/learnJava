package STL;

import java.util.ArrayList;
import java.util.List;

/**
 * 不同类型的对象可以放在同一个容器中
 * @author datefate
 * @site create 2020-10-27-下午8:41
 */
public class Test<T> {

//    和参数-Xlint:uncheched　一起运行

    public static void main(String[] args) {
        List shape = new ArrayList();
        shape.add(new Integer(11));
        shape.add(new Float(12.9));
        shape.add("sss");

        //可以运行成功：
        System.out.println(shape.get(1));
        System.out.println(shape.get(2));

        //获取元素:正确使用类型转换对数据进行矫正
        String gets =(String)shape.get(2);
        System.out.println(gets);

        // 不合法的数据矫正将导致程序运行时出错
        String gets２ =(String)shape.get(0);
        System.out.println(gets);

    }

}

//实现类传入类型参数，不必在ｄｅｍｏ后添加类型参数
class demo extends Test<Integer>{

}
