package multiThread;

import java.util.concurrent.CompletableFuture;

/**
 * @author datefate
 * @site create 2021-03-11-上午10:35
 */
/*
public class Main {
//    中止线程
public static void main(String[] args) throws InterruptedException {

    Thread t = new mythread();
    t.start();
    Thread.sleep(1000);
    t.interrupt();
    t.join();
    System.out.println("end");

}



}
class mythread extends Thread{
    public void run(){
        Thread hello = new HelloThread();
        hello.start();
        try {
            hello.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
        hello.interrupt();
    }
}

class HelloThread extends Thread{
    public void run(){
        int n=0;
        while (!isInterrupted()){
            n++;
            System.out.println(n+"hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }

    }
}
*/
    /*
    多线程共享变量
     */
/*
public class Main {
    public static void main(String[] args) throws Exception {
        var add = new AddThread();
        var dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }
}

class Counter {
    public static int count = 0;
}

class AddThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) { Counter.count += 1; }
    }
}

class DecThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) { Counter.count -= 1; }
    }
}

*/
/*
    对同一对象加不同的锁实现对不同变量的操作
 */
/*

public class Main {
    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis();
        var ts = new Thread[] { new AddStudentThread(), new DecStudentThread(), new AddTeacherThread(), new DecTeacherThread() };
        for (var t : ts) {
            t.start();
        }
        for (var t : ts) {
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序执行时间： "+(endTime -startTime)+"ms");
        System.out.println(Counter.studentCount);
        System.out.println(Counter.teacherCount);
    }
}

class Counter {
    public static final Object lock = new Object();
    public static final Object lock2= new Object();
    public static int studentCount = 0;
    public static int teacherCount = 0;
}

class AddStudentThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized(Counter.lock) {
                Counter.studentCount += 1;
            }
        }
    }
}

class DecStudentThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized(Counter.lock) {
                Counter.studentCount -= 1;
            }
        }
    }
}

class AddTeacherThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized(Counter.lock2) {
                Counter.teacherCount += 1;
            }
        }
    }
}

class DecTeacherThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized(Counter.lock2) {
                Counter.teacherCount -= 1;
            }
        }
    }
}
*/
/*

public class Main{
    public static void main(String[] args) {
        Thread p = new people();
        Thread p2 = new people();
        int x=0,y=1;
        p.start();
        p2.start();

    }

}


class people extends Thread{
    private static int studentNum=0;
    private static int techerNum=0;

    public synchronized void addS(){
        this.studentNum++;

    }
    public synchronized void des(){
        this.studentNum--;
    }

    public void run(int flag){
        if (flag == 0) {
            for (int i=0; i<10000; i++) {
                addS();
            }
        }else {
            for (int i=0; i<10000; i++) {
                des();
            }
        }
    }


    public void getStu(){
        System.out.println(this.studentNum);


    }
}
*/
//
//class TaskQueue{
//    private final Lock lock =new ReentrantLock();
//    private final Condition condition =lock.newCondition();
//    private Queue<String> queue = new LinkedList<>();
//
//
//}
//
//class Main{
//
//}


//public class Main{
//    public static void main(String[] args) throws InterruptedException {
//        var q = new TaskQueue();
//        var ts   = new ArrayList<Thread>();
//        for (int i = 0; i < 5; i++) {
//            var t = new Thread(){
//                public  void  run(){
//                    while (true){
//                        try{
//                            String s =q.getTask();
//                            System.out.println("execute task :"+ s);
//                        } catch (InterruptedException e) {
//                            return;
//                        }
//                    }
//                }
//            };
//            t.start();
//            ts.add(t);
//        }
//        var add = new Thread(() ->{
//            String s = "t-" + Math.random();
//            System.out.println("add task :"+s);
//            q.addTask(s);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//
//            }
//        });
//        add.start();
//        add.join();
//        Thread.sleep(100);
//        for (var t :ts){
//            t.interrupt();
//        }
//    }
//
//}
//
//class TaskQueue{
//    Queue<String> queue =new LinkedList<>();
//    public synchronized void addTask(String s){
//        this.queue.add(s);
//        this.notifyAll();
//    }
//
//    public synchronized String getTask() throws InterruptedException{
//        while (queue.isEmpty()){
//            this.wait();
//        }
//        return queue.remove();
//    }
//}


public class Main{
    static Double fetchPrice(){
        try{
            Thread.sleep(100);

        } catch (InterruptedException e) {
        }
        if (Math.random() < 0.3) {
            throw new RuntimeException("fetch price failed");
        }
        return 5+Math.random()*20;
    }

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Double> cf  = CompletableFuture.supplyAsync(Main::fetchPrice);
        cf.thenAccept((result)->{
            System.out.println("price:"+ result);
        });
        cf.exceptionally((e)->{
            System.out.println("wwwww");
            return null;
        });
        Thread.sleep(200);
    }
}
