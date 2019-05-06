package new03;

/*
 * this可以调用构造器
 * 	this(age)可以调用参数可以为age的构造器
 * 注意，若是在构造器中调用构造器，则最多只能调用一次本类其他的构造器(否则就会进入死循环)，且this声明必须放在行首 
 * 
 * 
 * */
public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This t1=new This(16);
		t1.getName();
		t1.getAge();
	}
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public void getName() {
		System.out.println(this.name);
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void getAge() {
		System.out.println(this.age);
	}
	This(){
		name="LittleControl";
	}
	This(int age){
		this();
		this.age=age;
	}

}







