/**
 * Author: littlecontrol
 * Date: 5/30/19 10:05 AM
 */
package top.littlecontrol;

public class ProCus {
    public static void main(String[] args) {
        Mid m1 = new Mid();
        Producer p1 = new Producer(m1);
        Customer c1 = new Customer(m1);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(c1);
        t1.setName("生产者");
        t2.setName("消费者");
        t1.start();
        t2.start();
    }
}

class Producer implements Runnable {
    private Mid m1;

    Producer(Mid m1) {
        this.m1 = m1;
    }

    @Override
    public synchronized void run() {
        while (true){
            notify();
            m1.make();
            if(m1.num==20){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Customer implements Runnable {
    private Mid m1;

    Customer(Mid m1) {
        this.m1 = m1;
    }

    @Override
    public synchronized void run() {
        while (true){
            notify();
            m1.destory();
            if(m1.num==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Mid {
    int num;

    Mid() {
        this.num = 0;
        this.num = 0;
    }

    public void make() {
        num++;
        System.out.println(Thread.currentThread().getName()+":Producing..No."+num);
    }

    public void destory() {
        System.out.println(Thread.currentThread().getName()+":Destoring ..No."+num);
        num--;
    }
}
