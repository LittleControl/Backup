package com.littlecontrol.top;

public class Test {
	public static void main(String[] args) {
		int a=10;
		int b=10;
		Test t1=new Test();
		t1.method(a,b);//要求在method方法调用之后，仅打印出a=100,b=200，请写出method方法的代码
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	//method方法代码编写处
	//典型错误做法
//	
//	
//	做法一：
	public void method(int a,int b) {
		a=100;
		b=200;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.exit(0);
	}
//	做法二
//	更改打印流，目前还不会
}






