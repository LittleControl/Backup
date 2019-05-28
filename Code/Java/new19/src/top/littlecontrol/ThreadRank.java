/**
 * Author: littlecontrol
 * Date: 5/28/19 8:13 AM
 */
package top.littlecontrol;
/*
* 线程默认的三个优先级
* MAX_PRIORITY=10   //最高优先级
* MIN_PRIORITY=1    //最低优先级
* NORM_PRIORITY=5   //默认优先级
*
* */
public class ThreadRank {
    public static void main(String[] args) {
        Rank r1=new Rank();
//        r1.setPriority(Thread.MAX_PRIORITY);
        r1.setPriority(Thread.MIN_PRIORITY);
        r1.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+": 也不能少活得精彩的勇气!");
        }
    }
}
class Rank extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            setName("Rank:");
            System.out.println(getName()+"日子和我都比较难过!");
        }
    }
}
