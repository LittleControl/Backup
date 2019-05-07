package com.littlecontrol.top;

public class Customer {
	private String name;
	private double balance;
	public String getName() {
//		System.out.println("名称： "+name);
		return(name);
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getBalance() {
//		System.out.println("余额： "+balance);
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void addBalance(double balance) {
		this.balance+=balance;
		System.out.println("当前余额： "+balance);
	}
	public void delBalance(double expense) {
		if(this.balance>=expense) {			
			this.balance-=expense;
		}else {
			System.out.println("抱歉，您的余额不足，无法完成操作");
		}
		System.out.println("当前余额："+balance);
	}
	Customer(String name,double balance){
		this.name=name;
		this.balance=balance;
	}
	Customer(String name){
		this.name=name;
		this.balance=0;
	}
	Customer(){
		
	}
}









