package test;

/**
 *
 *
 * @author datefate
 * @site create 2020-09-21-下午6:10
 */
public class HelloB extends HelloA
{
    public HelloB()
    {
    }
    {
        System.out.println("I’m B class");
    }
    static
    {
        System.out.println("static B");
    }
    public static void main(String[] args)
    {
        new HelloB();
    }
}
class HelloA
{
    public HelloA()
    {
    }
    {
        System.out.println("I’m A class");
    }
    static
    {
        System.out.println("static A");
    }
}
