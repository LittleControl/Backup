package top.littlecontrol;

public class Interface_New {
	public static void main(String[] args) {
		Infa1.sayHello();
		Say s1=new Say();
		s1.sayBye();
		Say1 s11=new Say1();
		s11.sayHello();//say0
	}
}
interface Infa1{
	static void sayHello() {//静态方法
		System.out.println("Hello,Java8!");
	}
	default void sayBye() {//默认方法
		System.out.println("Goodbye,Yesterday!");
	}
}
class Say implements Infa1{
	
}
class Say0{
	public void sayHello() {
		System.out.println("Say0");
	}
}
class Say1 extends Say0 implements Infa1{
	
}
interface Infa2{
	default void Say() {
		System.out.println("Infa2");
	}
}
interface Infa3{
	default void Say() {
		System.out.println("Infa3");
	}
}
class Say2{
	public void Say() {
		System.out.println("Say2");
	}
}
class Im1 extends Say2 implements Infa3,Infa2{
	public void Say() {
		super.Say();
		Infa2.super.Say();
		Infa3.super.Say();
	}
}











