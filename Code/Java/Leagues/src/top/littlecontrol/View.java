/*
 * 题目要求,从现有的军队中挑出五名士兵组成出战队伍
 * 队伍要求,至少一名法师,一名射手
 * 
 */
package top.littlecontrol;

public class View {
	public static void main(String[] args) {
		View view=new View();
		Army[] arr_Army=new Army[10];
		view.Init_Army(arr_Army);
		view.Print_Army(arr_Army);
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
