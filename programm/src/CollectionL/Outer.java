package CollectionL;

/**
 * @author datefate
 * @site create 2020-11-02-下午7:33
 */

public class Outer {

    public void methodOuter(){
        int  num  = 10;
        class Inner{
            public void methodInner(String[] args) {
                System.out.println(num);
            }
        }
    }

}
