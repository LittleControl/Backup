/**
 * Author: littlecontrol
 * Date: 5/30/19 10:06 AM
 */
package top.littlecontrol;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
 * 实现callable接口的方式创建多线程
 *
 * */
public class ThirdThread {
    public static void main(String[] args) {
        TirThread tt1 = new TirThread();
        FutureTask ft1 = new FutureTask(tt1);
        Thread t1 = new Thread(ft1);
        t1.start();
        for(int i=0;i<50;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

class TirThread implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
        return sum;
    }
}
