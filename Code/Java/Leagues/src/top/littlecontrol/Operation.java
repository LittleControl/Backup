package top.littlecontrol;

public class Operation {
	public void add(int id1,int id0,Member[] mem,Army[] arr_Army) {
		mem[id1]=new Member(id1, id0, arr_Army[id0].name, arr_Army[id0].career, arr_Army[id0].money);
		arr_Army[id0].status=false;
	}
	public void del(int id1,Member[] mem,Army[] arr_Army) {
		arr_Army[mem[id1].id0].status=true;
		for(int i=id1;i<4;i++) {
			mem[id1]=mem[id1+1];
		}
	}
	public void update(int id1,Member[] mem) {
		
	}
	public void Print_Member(Member[] mem) {
		for(int i=0;i<mem.length;i++) {
			System.out.println("编号\t姓名\t职业\t佣金\t");
			System.out.println(mem[i].id1+"("+mem[i].id0+")"+"\t"+mem[i].name+"\t"+mem[i].career+"\t"+mem[i].money+"\t");
		}
	}
}
