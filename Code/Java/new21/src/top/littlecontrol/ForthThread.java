/**
 * Author: littlecontrol
 * Date: 5/30/19 10:41 AM
 */
package top.littlecontrol;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 利用线程池创建多线程
 *
 * */
public class ForthThread {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        //execute适用于Runnable
        //submit适合用于callable
        service.execute(new Test2());
        for(int i=0;i<50;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
        service.shutdown();
    }
}

class Test2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
