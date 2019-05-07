package com.littlecontrol.top;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		int choice=0;
		Operate o1=new Operate();
		Scanner read=new Scanner(System.in);
		while(choice!=5) {
			System.out.println("\t\t欢迎光临银行流水管理系统");
			System.out.println("\t\t请选择您要执行的操作");
			System.out.println("\t\t    1.增加客户");
			System.out.println("\t\t    2.删除客户");
			System.out.println("\t\t    3.客户列表");
			System.out.println("\t\t    4.修改客户");
			System.out.println("\t\t    5.退出");
			choice=read.nextInt();
			if(choice==1) {
				o1.add();
			}
			if(choice==2) {
				o1.delCus();
			}
			if(choice==3) {
				o1.showCus();
			}
			if(choice==4) {
				o1.modeify();
			}
			if(choice==5) {
				read.close();
			}
		}
	}
}
