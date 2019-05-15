package top.littlecontrol;
/*
 * 饿汉式单例模式
 */
public class SingleOne {
	private SingleOne() {
		
	}
	private static SingleOne obj=new SingleOne();
	public static SingleOne getObj() {
		return obj;
	}
}
