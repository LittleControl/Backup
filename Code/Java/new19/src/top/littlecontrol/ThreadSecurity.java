/**
 * Author: littlecontrol
 * Date: 5/28/19 3:43 PM
 */
package top.littlecontrol;

public class ThreadSecurity {
    public static void main(String[] args) {
//        Ticket tt1=new Ticket();
//        Thread td1=new Thread(tt1);
//        Thread td2=new Thread(tt1);
//        Thread td3=new Thread(tt1);
//        td1.start();
//        td2.start();
//        td3.start();
        Ticket_Ex te1=new Ticket_Ex();
        Ticket_Ex te2=new Ticket_Ex();
        Ticket_Ex te3=new Ticket_Ex();
        te1.start();
        te2.start();
        te3.start();
    }
}

class Ticket implements Runnable{
    private int ticket=100;
    Object obj=new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj){
                if(ticket>0){
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+": "+ticket);
                    ticket--;
                }else {
                    System.out.println("The ticket is sold out !");
                    break;
                }
            }
        }
    }
}
class Ticket_Ex extends Thread{
    private static int ticket=100;
    private static Object obj=new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj){
                if(ticket>0){
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+": "+ticket);
                    ticket--;
                }else {
                    System.out.println("The ticket is sold out !");
                    break;
                }
            }
        }
    }
}