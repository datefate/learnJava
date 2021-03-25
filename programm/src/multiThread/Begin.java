package multiThread;

/**
 * @author datefate
 * @site create 2021-03-11-上午9:52
 */
public class Begin {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main.start...");
        Thread thread1 = new FirstThread();
        Thread thread2 = new Thread(new SecThread());
        thread1.start();
        thread2.start();
        Thread.sleep(1);
        thread1.interrupt();
        System.out.println("main.stop!");
    }


}

class FirstThread extends Thread{
    @Override
    public void run (){
        int n =0;


//  Q :main sleep(1),注释代码会执行则会造成，线程无法被打断
        System.out.println("Start new Thread...");
//        try {
//            Thread.sleep(20);
//            System.out.println("thread1 sleep over!");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        while (!isInterrupted()) {
            n++;
            System.out.println(n+"hello");
        }
        System.out.println("Thread1 stop!");

    }
}

class SecThread implements Runnable{

    public void run() {
        System.out.println("implements Runable Thread");
        System.out.println("Start Tread2");
        System.out.println("Thread2 over");

    }
}
