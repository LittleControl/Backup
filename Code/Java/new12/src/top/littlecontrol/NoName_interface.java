package top.littlecontrol;

public class NoName_interface {
	public static void main(String[] args) {
		Name n1=new ExName();//非匿名接口的非匿名对象
		n1.sayName();//控
		new Name() {//非匿名接口的匿名对象
			@Override
			public void sayName() {
				System.out.println(name);
			}
		}.sayName();//控
		Age a1=new Age() {//匿名接口的非匿名对象
			@Override
			public void sayName() {
				System.out.println(name);
			}
			@Override
			public void sayAge() {
				System.out.println(age);
			}
		};
		a1.sayName();//控
		a1.sayAge();//18
		new Age() {//匿名接口的匿名对象
			@Override
			public void sayName() {
				System.out.println(name);
			}
			@Override
			public void sayAge() {
				System.out.println(age);
			}
		}.sayName();//控
	}	
}
interface Name{
	String name="控";
	void sayName();
}
interface Age extends Name{
	int age=18;
	void sayAge();
}
class ExName implements Name,Age{

	@Override
	public void sayName() {
		System.out.println(name);
	}

	@Override
	public void sayAge() {
		System.out.println(age);
	}
}
