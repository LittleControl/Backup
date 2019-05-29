/**
 * Author: littlecontrol
 * Date: 5/29/19 8:54 PM
 */
package top.littlecontrol;

public class DeadLock {
    public static void main(String[] args) {
        Object s1 = new Object();
        Object s2 = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s1){
                    System.out.println(Thread.currentThread().getName()+"11111111");
                    synchronized (s2){
                        System.out.println(Thread.currentThread().getName()+"222222222");
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2){
                    System.out.println(Thread.currentThread().getName()+"333333");
                    synchronized (s1){
                        System.out.println(Thread.currentThread().getName()+"444444");
                    }
                }
            }
        }).start();

    }
}

