package top.littlecontrol;
/*
 * 四种权限修饰符	//一般也就private与public经常用
 * private		//仅限本类内使用
 * 缺省(default)	//同一个包的类可以使用
 * protected	//不同包的类可以使用
 * pubic		//同一个工程里的都可以使用
 * 
 * */
class Test {
	public static void main(String[] args) {
//		Default d1=new Default();
//		d1.say();
		Person p1=new Man();
		p1.eat();
		System.out.println(p1.age);
		System.out.println(p1.money);
		Man p2=new Man();
		System.out.println(p2.age);
		
	}
}
