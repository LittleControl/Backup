/**
 * Author: littlecontrol
 * Date: 6/1/19 9:06 AM
 */
package top.littlecontrol;

import java.util.concurrent.*;

public class ThreadForth {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        /*一般来讲,execute常用与Runnable实现类,而submit常用于Callable实现类*/
        service.execute(new Test1());
        service.execute(new Test1());
        service.execute(new Test2());
        service.submit(new Test3());
        FutureTask ft1= (FutureTask) service.submit(new Test3());
        new Thread(ft1).start();
        int sum = (int) service.submit(new Test3()).get();
        System.out.println(sum);
        service.shutdown();
    }
}

class Test1 extends Thread {
    @Override
    public void run() {
        System.out.println("********");
        System.out.println(Thread.currentThread().getName());
    }
}

class Test2 implements Runnable {
    @Override
    public void run() {
        System.out.println("##########");
        System.out.println(Thread.currentThread().getName());
    }
}

class Test3 implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("$$$$$");
        return sum;
    }
}
