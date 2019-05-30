/**
 * Author: littlecontrol
 * Date: 5/30/19 9:16 AM
 */
package top.littlecontrol;

/*
 * 线程的通信
 * notify
 * notifyall
 * wait
 * wait 与 sleep 区别与联系
 *
 * */
public class ComThread {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Thread td1 = new Thread(t1);
        Thread td2 = new Thread(t1);
        td1.setName("First");
        td2.setName("Second");
        td1.start();
        td2.start();
    }
}

class Test1 implements Runnable {
    private int num = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                } else {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
