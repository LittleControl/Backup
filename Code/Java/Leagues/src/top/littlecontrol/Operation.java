package top.littlecontrol;

import java.util.Scanner;

public class Operation {
	public void Del(int id1,Member[] mem,Army[] arr_Army) {
		arr_Army[mem[id1].id0].status=true;
		for(int i=id1;i<4;i++) {
			mem[id1]=mem[id1+1];
		}
	}
	public void Update(int id1,Member[] mem) {
		Scanner read=new Scanner(System.in);
		System.out.println("请输入您要修改的姓名");
		String name=read.next();
		System.out.println("请输入您要修改的职业");
		String career=read.next();
		System.out.println("请输入您要修改的佣金");
		int money=read.nextInt();
		mem[id1].name=name;
		mem[id1].career=career;
		mem[id1].money=money;
	}
	public void Print_Member(Member[] mem,int count) {
		System.out.println("编号\t姓名\t职业\t佣金\t");
		for(int i=0;i<count;i++) {
			System.out.println(mem[i].id1+"("+mem[i].id0+")"+"\t"+mem[i].name+"\t"+mem[i].career+"\t"+mem[i].money+"\t");
		}
	}
	public int Add(int id1,int id0,Member[] mem,Army[] arr_Army) {
		int result=0;
		if(id1>=5) {
			System.out.println("出战成员已满,不可添加");
			result=-1;
		}else if(arr_Army[id0].status==false) {
			System.out.println("该成员已经出战,不可继续添加!");
			result=-1;
		}else {
			int tag=Check(id1, mem);
			if(tag==1&&arr_Army[id0].career.equals("法师")){
				System.out.println("法师人数已达上限,无法添加");
				result=-1;
			}else if(tag==2&&arr_Army[id0].career.equals("射手")) {
				System.out.println("射手人数已达上限,无法添加");
				result=-1;
			}else if(tag==3&&(arr_Army[id0].career.equals("法师")||arr_Army[id0].career.equals("射手"))) {
				System.out.println("法师和射手的人数已达上限,无法添加");
				result=-1;
			}else if((id1==3)&&tag==0&&(!(arr_Army[id0].career.equals("法师")||arr_Army[id0].career.equals("射手")))) {
				System.out.println("法师或射手的人数不够,请添加法师或射手");
				result=-1;
			}else if(id1==4&&tag==1&&(!arr_Army[id0].career.equals("射手"))) {
				System.out.println("射手的人数不够,请添加射手");
				result=-1;
			}else if(id1==4&&tag==2&&(!arr_Army[id0].career.equals("法师"))) {
				System.out.println("法师的人数不够,请添加法师");
				result=-1;
			}else {
				arr_Army[id0].status=false;
				mem[id1]=new Member(id1, id0, arr_Army[id0].name, arr_Army[id0].career, arr_Army[id0].money);
			}
		}
		return result;
	}
	private int Check(int id1,Member[] mem) {
		String name1="法师";
		String name2="射手";
		int tag1=0;
		int tag2=0;
		for(int i=0;i<id1;i++) {
			if(mem[i].career.equals(name1)) {
				tag1=1;
			}
			if(mem[i].career.equals(name2)) {
				tag2=1;
			}
		}
		if(tag1==1&&tag2==0) {
			return 1;//射手不足
		}else if(tag1==0&&tag2==1) {
			return 2;//法师不足
		}else if(tag1==1&&tag2==1) {
			return 3;//法师与射手均足
		}else {
			return 0;//法师与射手均不足
		}
	}
}





