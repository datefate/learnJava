package ExceptionsTest;

/**
 * 涉及抛出异常的顺序、printStackTrace()
 *
 * @author datefate
 * @site create 2020-09-22-下午7:31
 */
public class exceptionTest {


    public static void main(String[] args) {
        try {
            process1();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Wow");
        }
    }
    static void process1(){
    try {
        pricess2();

    }catch (Exception e){
        throw  new IllegalArgumentException(e);

    }
    }
    static void pricess2(){
        throw new NullPointerException();
    }

}

