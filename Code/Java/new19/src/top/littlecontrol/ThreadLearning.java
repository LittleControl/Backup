/**
 * Author: littlecontrol
 * Date: 5/28/19 7:33 AM
 */
package top.littlecontrol;
/*
* 线程常用的方法
* currentThread
* getName
* setName
* yield
* stop(已过时,不推荐使用)
* join
* isAlive
*
* */
public class ThreadLearning {
    public static void main(String[] args) {
        MyThread mt1=new MyThread();
        mt1.setName("mt1");
        mt1.start();
        for (int i = 0; i <100 ; i++) {
            if(i%5==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
//            if(i%10==0){
//                try {
//                    mt1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
        System.out.println(mt1.isAlive());
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <100 ; i++) {
            if(i%10==0){
                System.out.println(getName()+":"+i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(i%20==0){
                yield();
            }
        }
    }
}
