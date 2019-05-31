/**
 * Author: littlecontrol
 * Date: 5/31/19 8:41 AM
 */
package top.littlecontrol;

public class Make_Destory {
    public static void main(String[] args) {
        Mid m1 = new Mid();
        Producer p1 = new Producer(m1);
        Thread t1 = new Thread(p1);
        Customer c1 = new Customer(m1);
        Thread t2 = new Thread(c1);
        t1.setName("Maker   ");
        t2.setName("Destorier   ");
        t1.start();
        t2.start();
        Customer c2 = new Customer(m1);
        Thread t3 = new Thread(c2);
        t3.start();
    }
}

class Mid {
    private int num;

    public synchronized void make() {
        if (num < 20) {
            num++;
            notify();
            notifyAll();
            System.out.println(Thread.currentThread().getName() + "Making...No." + num);
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void destory() {
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + "Destoring...No." + num);
            num--;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable {
    private Mid mid;

    Producer(Mid mid) {
        this.mid = mid;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mid.make();
        }
    }
}

class Customer implements Runnable {
    private Mid mid;

    Customer(Mid mid) {
        this.mid = mid;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(22);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mid.destory();
        }
    }
}
