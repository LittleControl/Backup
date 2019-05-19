package littlecontrol.top;

public class InnerClass {
	public static void main(String[] args) {
		Inner1 i1=new Inner1();
		i1.sayNum();
		Inner1.Inner2 i2=i1.new Inner2();//实例化一个非static的成员内部类,需要一个外部类的一个实例化对象
		i2.sayNum();
		Inner1.Inner3 i3=new Inner1.Inner3();//实例化一个static成员内部类,不需要一个外部类的一个实例化对象
		i3.sayNum();
	}
}

class Inner1{
	int num=0;
	public void sayNum() {
		int age=18;
		System.out.println(this.num);
		class Inner4{
			public void sayNum() {
//				age=18;//当外部类的一个方法中定义了一个变量,而这个方法中的局部内部类要使用这个变量,则这个变量在局部内部类是final修饰的
//				或者这样说,外部类的方法中定义的变量,这个方法中的局部内部类可以使用,但是不可以修改
				System.out.println(age);
			}
		}
	}
	class Inner2{
		int num=10;
		public void sayNum() {
			System.out.println(Inner1.this.num);
//			System.out.println(Inner1.Inner3.this.num);//错误,同级的内部类无法直接调用
			System.out.println(this.num);
		}
	}
	static class Inner3{
		int num=100;
		public void sayNum() {
//			System.out.println(Inner1.Inner2.num);//错误,静态方法中无法调用非静态的属性
			System.out.println(this.num);
		}
	}
}


















