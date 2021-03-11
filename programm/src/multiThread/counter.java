package multiThread;

/**
 * @author datefate
 * @site create 2021-03-21-下午2:04
 */
public class counter{

//    synchronized  锁
    private  int count;

    public counter(){
        this.count=0;
    }
    public counter(int count){
        this.count = count;
    }

    public void add(){
        synchronized (this){
            count ++;
        }
    }

    public void de( ){
        synchronized (this){
            count--;
        }
    }

    public static void main(String[] args) {
        counter c1 = new counter();

        Thread th1 = new Thread(()->{
            long startTime = System.currentTimeMillis();
            System.out.println("th1 start:" +startTime);
            for (int i = 0;i<10 ;i++ ) {
                c1.add();
                System.out.println(c1.count);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("code run cost:"+(startTime-endTime)+"ms");
            System.out.println("th1 end time:"+endTime);

        });
        th1.start();

        Thread th2 = new Thread(()->{
            long startTime = System.currentTimeMillis();
            System.out.println("th2 start:" + startTime);
            for (int i =0 ;i<10  ;i++ ) {
                c1.de();
                System.out.println(c1.count);

            }
            long endTime = System.currentTimeMillis();
            System.out.println("code run cost:"+(startTime-endTime)+"ms");
            System.out.println("th2 end time:"+endTime);


        });

        th2.start();

    }


}
