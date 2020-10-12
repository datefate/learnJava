package ExceptionsTest;

/**
 * 使用断言必须在运行时给jvm传递参数：
 * 切换到class文件下：java -ea ExceptionsTest.AssertPractice
 *
 * 断言是一种调试方式，断言失败会抛出AssertionError，只能在开发和测试阶段启用断言；
 *
 * 对可恢复的错误不能使用断言，而应该抛出异常；
 *
 * 断言很少被使用，更好的方法是编写单元测试
 * @author datefate
 * @site create 2020-10-09-下午3:27
 */
public class AssertPractice {
    public static void main(String[] args) {
//        double x = Math.abs(-123.45);
        int x = -1;
        assert x >= 0:"x must bigger than zero";
        System.out.println(x);
    }
}
