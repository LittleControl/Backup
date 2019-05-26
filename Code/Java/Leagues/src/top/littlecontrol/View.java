/*
 * 题目要求,从现有的军队中挑出五名士兵组成出战队伍
 * 队伍要求,至少一名法师,一名射手
 * 
 */
package top.littlecontrol;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		View view=new View();
		Army[] arr_Army=new Army[10];
		view.Init_Army(arr_Army);
		view.Print_Army(arr_Army);
		Member[] mem=new Member[5];
		Operation op1=new Operation();
		Scanner read=new Scanner(System.in);
		System.out.println("请做出你的选择,-1表示退出");
		System.out.println("1.增加出战成员 2.删除出战成员 3.修改出战成员 4.查看出战成员 5.查看军团成员");
		/* count 用来计数member中的成员个数*/
		int count=0;
		/* id1是member的组内序号,默认与count保持一致*/
		int id1=count;
		int choice=read.nextInt();
		while(choice!=-1) {
			if(choice==1) {
				System.out.println("请输入你要增加的出战成员的原始ID");
				int id0=read.nextInt();
				id1=count;
				int result=op1.Add(id1, id0, mem, arr_Army);
				if(result==0) {
					count++;
					id1++;
				}
			}else if(choice==2) {
				System.out.println("请输入你要删除的出战成员的组内ID");
				id1=read.nextInt();
				if(id1>=5) {
					System.out.println("你的输入有误,输入的数不应该大于4");
				}else {
					op1.Del(id1, mem, arr_Army);
					count--;
				}
			}else if(choice==3) {
				System.out.println("请输入你要修改的出站成员的组内ID");
				if(id1>=5) {
					System.out.println("你的输入有误,输入的数不应该大于4");
				}else {
					id1=read.nextInt();
					op1.Update(id1, mem);
				}
			}else if(choice==4) {
				op1.Print_Member(mem,count);
			}else if(choice==5) {
				view.Print_Army(arr_Army);
			}else {
				System.out.println("你的输入有误,请重新输入!");
			}
			System.out.println("请做出你的选择,-1表示退出");
			System.out.println("1.增加出战成员 2.删除出战成员 3.修改出战成员 4. 查看出战成员 5.查看军团成员");
			choice=read.nextInt();
		}
		read.close();
		System.out.println("退出成功!");
	}
	public void Init_Army(Army[] arr_Army) {
		arr_Army[0]=new Army(0,"锐雯","战士",6300,true);
		arr_Army[1]=new Army(1,"辛德拉","法师",6300,true);
		arr_Army[2]=new Army(2,"泰隆","刺客",6300,true);
		arr_Army[3]=new Army(3,"德莱文","射手",6300,true);
		arr_Army[4]=new Army(4,"易大师","战士",450,true);
		arr_Army[5]=new Army(5,"布兰德","法师",4800,true);
		arr_Army[6]=new Army(6,"伊泽瑞尔","射手",1800,true);
		arr_Army[7]=new Army(7,"科加斯","坦克",6300,true);
		arr_Army[8]=new Army(8,"墨菲特","坦克",4800,true);
		arr_Army[9]=new Army(9,"索拉卡","辅助",450,true);
	}
	public void Print_Army(Army[] arr_Army) {
		System.out.println("编号\t姓名\t职业\t佣金\t雇佣状态(true表示可以雇佣)\t");
		for(int i=0;i<arr_Army.length;i++) {
			System.out.println(arr_Army[i].id+"\t"+arr_Army[i].name+"\t"+arr_Army[i].career+"\t"+arr_Army[i].money+"\t"+arr_Army[i].status+"\t");
		}
	}
	public void Select() {
		
	}
}
