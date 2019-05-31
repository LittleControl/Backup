/**
 * Author: littlecontrol
 * Date: 5/31/19 12:49 PM
 */
package top.littlecontrol;

import java.util.concurrent.locks.ReentrantLock;

public class MakeDestory2 {
    public static void main(String[] args) {
        Medium me = new Medium();
        Maker m1 = new Maker(me);
        Destoier d1 = new Destoier(me);
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(d1);
        t1.setName("Little");
        t2.setName("Control");
        t1.start();
        t2.start();
    }
}

class Medium {
    int num = 0;
    private ReentrantLock lock = new ReentrantLock();
    Medium() {

    }

    public void make() {
        lock.lock();
        if(num < 20){
            lock.notify();
            num++;
            System.out.println(Thread.currentThread().getName()+"Making...No."+num);
        } else {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.unlock();
    }
    public void destory() {
        lock.lock();
        if(num > 0){
            lock.notify();
            System.out.println(Thread.currentThread().getName()+"Destoring...No."+num);
            num--;
        } else {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.unlock();
    }
}

class Maker implements Runnable {
    Medium me;
    Maker(Medium me) {
        this.me = me;
    }
    @Override
    public void run() {
        while (true) {
            me.make();
        }
    }
}

class Destoier implements Runnable {
    Medium me;
    Destoier(Medium me){
        this.me = me;
    }
    @Override
    public void run() {
        while (true) {
            me.destory();
        }
    }
}
