package top.littlecontrol;

/*
 * 在子类中，可以用super关键字来调用父类中与子类重名的变量，方法或者构造器
 * super与this的寻找范围都是一级一级向上寻找，如果在某一层找到了则终止寻找
 * 
 * */

class Super1 extends Super{
	public void setName() {
		name="LittleControl";
	}
	public void setAge() {
		age=19;
	}
	public void showName() {
		System.out.println(this.name);
	}
	public void showAge() {
		System.out.println(this.age);
	}
//	public void say() {
//		super.say();
//		System.out.println("Hello,LittleControl!");
//	}
}
