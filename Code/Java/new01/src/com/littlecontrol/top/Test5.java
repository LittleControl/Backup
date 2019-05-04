package com.littlecontrol.top;

public class Test5 {
	public static void main(String[] args) {
		Test5 t1=new Test5();
		System.out.println(t1.Fac(5));
		System.out.println(t1.Arr(10));
		System.out.println(t1.Arr1(10));
//		System.out.println(t1.Fib(3));
		t1.PrintFib(10);
	}
//递归求阶乘
	public int Fac(int n) {
		if(n==1) {
			return n;
		}else {
			return n*Fac(n-1);
		}
	}
//已知一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的整数，求f(10)的值
	
	public int Arr(int n) {
		if(n==0) {
			return 1;
		}else if(n==1) {
			return 4;
		}else {
			return 2*Arr(n-1)+Arr(n-2);
		}
	}
//	已知一个数列:f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的整数，求f(10)的值
	public int Arr1(int n) {
		if(n==20) {
			return 1;
		}else if(n==21) {
			return 4;
		}else {
			return Arr1(n+2)-2*Arr1(n+1);
		}
	}
/*
 * 输入以数据n，计算斐波那契数列(Fibonacci)的第n个值
 * 1 1 2 3 5 8 13 21 34 55
 * 规律 一个数等于前两个数之和
 * 要求：计算斐波那契数列的第n个值，并将整个数列打印出来
 * */	
	public int Fib(int n) {
		if(n==1) {
//			System.out.print("1\t");
			return 1;
		}else if(n==2) {
//			System.out.print("1\t");
			return 1;
		}else {
//			System.out.print((Fib(n-1)+Fib(n-2))+"\t");
			return Fib(n-1)+Fib(n-2);
		}
	}
	public void PrintFib(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(Fib(i)+"\t");
		}
	}
	
	
}
