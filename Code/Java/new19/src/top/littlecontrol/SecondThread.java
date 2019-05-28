/**
 * Author: littlecontrol
 * Date: 5/28/19 8:55 AM
 */
package top.littlecontrol;

public class SecondThread {
    public static void main(String[] args) {
        Ticket1 t11=new Ticket1();
        Ticket1 t12=new Ticket1();
        Ticket1 t13=new Ticket1();
        t11.setName("t11");
        t12.setName("t12");
        t13.setName("t13");
        t11.start();
        t12.start();
        t13.start();
        Ticket2 t21=new Ticket2();
        Thread t1=new Thread(t21);
        Thread t2=new Thread(t21);
        Thread t3=new Thread(t21);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket2 implements Runnable{
    private int num=10;
    @Override
    public void run() {
        while (true){
            if(num>0){
                System.out.println(Thread.currentThread().getName()+" 当前剩余数量:"+num);
                num--;
            }else {
                System.out.println(Thread.currentThread().getName()+" 数量为0");
                break;
            }
        }
    }
}

class Ticket1 extends Thread{
    private static int num=10;

    @Override
    public void run() {
        while (true){
            if(num>0){
                System.out.println(getName()+" 当前剩余数量:"+num);
                num--;
            }else {
                System.out.println(getName()+" 数量为0");
                break;
            }
        }
    }
}
