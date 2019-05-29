/**
 * Author: littlecontrol
 * Date: 5/29/19 5:26 PM
 */
package top.littlecontrol;

import java.util.concurrent.locks.ReentrantLock;

public class BankTest {
}

class Bank {
    private Bank() {

    }
    static ReentrantLock lock = new ReentrantLock();
    static private Bank bankInstance = null;
    public Bank getInstance(){
        if(bankInstance==null){
            lock.lock();
            bankInstance=new Bank();
        }
        lock.unlock();
        return bankInstance;
    }
}
