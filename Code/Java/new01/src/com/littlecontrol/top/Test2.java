package com.littlecontrol.top;
/*
 * 定义一个int型数组：int[] arr = new int[]{12,3,3,34,56,77,432}
 * 让数组的每个位置上的值去除以首位置的元素，得到的结果，作为该位置上的新值
 * 遍历新的数组
 * */
public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[] {12,3,3,34,56,77,432};
		for(int i=arr.length-1;i>=0;i--) {
			arr[i]/=arr[0];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}