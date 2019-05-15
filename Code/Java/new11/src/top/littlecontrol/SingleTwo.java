package top.littlecontrol;
/*
 * 懒汉式单例模式
 * */
public class SingleTwo {
	private SingleTwo() {
		
	}
	private static SingleTwo obj=null;
	public static SingleTwo getObj() {
		if(obj!=null) {
			obj=new SingleTwo();
		}
		return obj;
	}
}
