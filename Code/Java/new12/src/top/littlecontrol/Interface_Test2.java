package top.littlecontrol;

public class Interface_Test2 {
	
}
interface A{
	int x=0;
}
class B{
	int x=1;
}
class C extends B implements A{
	public void getX() {
//		System.out.println(x);//编译不通过,x是不明确的
		System.out.println(A.x);
		System.out.println(super.x);
	}
}
