package top.littlecontrol;
/*
 * a instanceof B	用于判断a是否是B的子类，是则返回true，反之返回false 
 */
public class Testtest {
	public static void main(String[] args) {
//		Person p1=new Male();
//		Male m2=(Male)p1;
//		m2.say();
//		m2.Fly();
//		if(p1 instanceof Male) {
//			System.out.println("p1 in Male!");
//		}
//		if(p1 instanceof Person) {
//			System.out.println("p1 in Person!");
//		}
		//编译通过，运行不通过
//		Person p1=new Male();
//		Female f1=(Female)p1;
//		f1.shopping();
//		Object o1=new Person();
//		Male m1=(Male)o1;
//		m1.Fly();
		//编译运行都可以通过
//		Object o2=new Female();
//		Person p2=(Person)o2;
//		p2.say();
		//编译和运行都不能通过
//		Male m2=new Male();
//		Female f2=(Female)m2;
		Person p3=new Male();
		p3.show();
	}
}









