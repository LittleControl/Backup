/**
 * Author: littlecontrol
 * Date: 5/27/19 6:48 PM
 */
package top.littlecontrol;

public class ThreadTest extends Thread{
    public static void main(String[] args) {
        ThreadTest tt1=new ThreadTest();
        tt1.start();
        for (int i = 1; i < 100; i++) {
            if(!(i%2==0)){
                System.out.print(i+"****");
            }
            if(i%10==1){
                System.out.println();
            }
        }
    }
    public void run(){
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.print(i+"\t");
            }
            if(i%10==0){
                System.out.println();
            }
        }
    }
}
