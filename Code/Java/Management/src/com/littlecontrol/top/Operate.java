package com.littlecontrol.top;

import java.util.Scanner;

public class Operate {
	private int cusNum=0;
	Customer[] cusArray=new Customer[99];
	public void add() {
		cusArray[cusNum]=new Customer();
		Scanner read=new Scanner(System.in);
		System.out.println("请输入用户名");
		cusArray[cusNum].setName(read.next());
		System.out.println("请输入余额");
		cusArray[cusNum].addBalance(read.nextDouble());
		System.out.println("添加成功!");
		cusNum++;
	}
	public void showCus() {
		System.out.println("编号\t\t\t姓名\t\t余额");
		for(int i=0;i<cusNum;i++) {
			System.out.println(i+"\t\t\t"+cusArray[i].getName()+"\t\t"+cusArray[i].getBalance());
		}
	}
	public void delCus() {
		System.out.println("请输入要删除的客户编号");
		Scanner read=new Scanner(System.in);
		int num=read.nextInt();
		for(int i=num;i<cusNum-1;i++) {
			cusArray[i]=cusArray[i+1];
		}
		cusNum--;
		System.out.println("删除完成!");
	}
	public void modeify() {
		System.out.println("请输入要修改的客户的编号");
		Scanner read=new Scanner(System.in);
		int num=read.nextInt();
		System.out.println("名称(输入'wq'表示不修改): ");
		String name=read.next();
		if(!name.equals("wq")) {
			System.out.println(name);
			System.out.println("Testing...");
			cusArray[num].setName(name);
		}
		System.out.println("余额(输入'-1'表示不修改): ");
		int balance=read.nextInt();
		if(balance!=-1) {
			cusArray[num].setBalance(balance);
		}
	}
}





