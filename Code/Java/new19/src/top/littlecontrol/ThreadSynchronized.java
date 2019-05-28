/**
 * Author: littlecontrol
 * Date: 5/28/19 5:01 PM
 */
package top.littlecontrol;

public class ThreadSynchronized {
    public static void main(String[] args) {
//        Window1 w11=new Window1();
//        Thread t1=new Thread(w11);
//        Thread t2=new Thread(w11);
//        Thread t3=new Thread(w11);
//        t1.start();
//        t2.start();
//        t3.start();
        Window2 w21 = new Window2();
        Window2 w22 = new Window2();
        Window2 w23 = new Window2();
        w21.start();
        w22.start();
        w23.start();
    }
}
class Window1 implements Runnable{
    private int num=50;

    @Override
    public void run() {
        while(true){
            show();
        }
    }
    public synchronized void show(){
        if(num>0){
            System.out.println(Thread.currentThread().getName()+":"+num);
            num--;
        }
    }
}

class Window2 extends Thread{
    private static int ticket=100;

    @Override
    public void run() {
        while(true){
            carry();
        }
    }
    public static synchronized void carry(){
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+":"+ticket);
            ticket--;
        }
    }
}