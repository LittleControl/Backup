/**
 * Author: littlecontrol
 * Date: 5/29/19 5:26 PM
 */
package top.littlecontrol;

import java.util.concurrent.locks.ReentrantLock;

public class ThirdThread {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();
        mt1.setName("mt1");
        mt2.setName("mt2");
        mt3.setName("mt3");
        mt1.start();
        mt2.start();
        mt3.start();

    }
}

class MyThread extends Thread {
    private static int ticket = 100;
    static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":" + ticket);
                ticket--;
            } else {
                System.out.println("The tickets is sold out !");
                break;
            }
            lock.unlock();
        }
    }
}
