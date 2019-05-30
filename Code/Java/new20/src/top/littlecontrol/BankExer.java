/**
 * Author: littlecontrol
 * Date: 5/29/19 9:11 PM
 */
package top.littlecontrol;

/*
 * 银行有一个账户,有两个账户分别向同一个账户存3000元,每次存1000,存3次.每次存完打印账户余额
 * 问题:该程序是否有安全问题,如果有,如何解决?
 * 【提示】
 * 1.明确那些代码是多线程代码,须写入run()方法
 * 2.明确什么是共享数据
 * 3.明确多线程运行代码中那些语句是操作共享数据的
 * 拓展问题:可否实现两个储户的交替存钱的操作
 *
 * */
public class BankExer {
    public static void main(String[] args) {
        Account acc=new Account();
        Customer c1=new Customer(acc);
        Customer c2=new Customer(acc);
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c1);
        t1.setName("AAA");
        t2.setName("BBB");
        t1.start();
        t2.start();
    }
}

class Account{
    double balance;
    Account(){
        this.balance=0.0;
    }
}
class Customer implements Runnable{
    private Account acc;
    Customer(Account acc){
        this.acc=acc;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acc.balance+=1000;
            System.out.println(Thread.currentThread().getName()+": Current Money: "+acc.balance);
        }
    }
}
