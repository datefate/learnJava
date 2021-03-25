package InnerClass;

/**匿名内部类
 * @author datefate
 * @site create 2020-11-02-下午8:15
 */
public class DemeMain {
    public static void main(String[] args) {

        //使用匿名内部类:
//       缺点：必须实现所有的接口
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现类实现方法");
            }

            public void method2() {

            }


        };


    }


}
