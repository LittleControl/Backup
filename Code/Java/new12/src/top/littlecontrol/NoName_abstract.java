package top.littlecontrol;

public class NoName_abstract {
	public static void main(String[] args) {
		Ab2 ab2=new Ab2();
		ab2.sayName();//非匿名抽象类的非匿名对象
		new Ab2().sayName();//非匿名抽象类的匿名对象
		Ab1 ab1=new Ab1() {//匿名抽象类的非匿名对象

			@Override
			void sayName() {
				// TODO Auto-generated method stub
				System.out.println(this.name);
			}
			
		};
		ab1.sayName();
		new Ab1() {

			@Override
			void sayName() {
				// TODO Auto-generated method stub
				System.out.println(this.name);
			}
			
		}.sayName();//匿名抽象类的匿名对象
	}
}
abstract class Ab1{
	String name="李";
	abstract void sayName();
}
class Ab2 extends Ab1{

	@Override
	void sayName() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
	}

}
