/**
 * Author: littlecontrol
 * Date: 5/27/19 9:08 PM
 */
package top.littlecontrol;
/*
* 多线程中通过start方法来执行重写的run方法中的代码,不能直接调用run方法来执行代码
* 一个多线程的一个实例化对象只能执行一次start方法,不能执行多次
*
* */
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<50;i++){
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<50;i++){
                if(i%2!=0){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
            }
        }.start();
    }
}
