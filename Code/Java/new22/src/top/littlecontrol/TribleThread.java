/**
 * Author: littlecontrol
 * Date: 5/31/19 9:17 AM
 */
package top.littlecontrol;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TribleThread {
    public static void main(String[] args) {
        CallableTest ct1 = new CallableTest();
        CallableTest ct2 = new CallableTest();
        FutureTask ft1 = new FutureTask(ct1);
        FutureTask ft2 = new FutureTask(ct1);
        FutureTask ft3 = new FutureTask(ct2);
        Thread t1 = new Thread(ft1);
        /*似乎,一个FutureTask的实例对象只能创建一个线程*/
//        Thread t2= new Thread(ft1);
        Thread t3 = new Thread(ft2);
        Thread t4 = new Thread(ft3);
        t1.start();
        t1.setName("First");
//        t2.start();
//        t2.setName("Second");
        t3.setName("Thrid");
        t3.start();
        t4.setName("Fourth");
        t4.start();
        try {
            Object name = ft1.get();
            System.out.println(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class CallableTest implements Callable {

    @Override
    public Object call() throws Exception {
        String name = "LittleControl";
        System.out.println(Thread.currentThread().getName() + ": Helllo," + name);
        return name;
    }
}
