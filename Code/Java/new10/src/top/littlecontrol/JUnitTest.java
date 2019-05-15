package top.littlecontrol;

import org.junit.jupiter.api.Test;

public class JUnitTest {
	@Test
	public void Single() {
		Single1 s1=Single1.getObj();
		Single1 s2=Single1.getObj();
//		Single1 s3=new Single1();
//		System.out.println(s1.name);
		System.out.println(s1==s2);//true
	}
}
//单例模式的饿汉式实现
class Single1{
	private String name="Littlecontrol";
	private int age=19;
	private Single1() {
		
	}
	private static Single1 s1=new Single1();
	public static Single1 getObj() {
		return s1;
	}
}
