package top.littlecontrol;

public class Abstract3 extends Abstract2 {
	String name="RainSorrowControl";
	Abstract3(){
		super();
		System.out.println(this.name);
	}
	@Override
	public void getName() {
		// TODO Auto-generated method stub
//		System.out.println(super.super.name);
		System.out.println(super.name);
		System.out.println(this.name);
	}

}
