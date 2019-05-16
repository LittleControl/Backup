package top.littlecontrol;

public class Interface_Test implements Interface {

	public static void main(String[] args) {
		Interface_Test it1=new Interface_Test();
		it1.sayName();
	}
	@Override
	public void sayName() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"(╯﹏╰)");
	}
	
}
