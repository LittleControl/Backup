package new02;
/*
 * 构造器
 * 	1、一个类一定有一个构造器，当自己没有定义构造器时，系统会默认提供一个空参构造器
 * 		如果自己定义了一个构造器，则系统不再提供空参构造器
 * 	2、构造器不同的参数，构成构造器的重载
 * 	编写两个类，TriAngle和TriAngle Test，其中TriAngle类中生命私有的底边长base和高height，
 * 	同时声明公共方法访问私有变量。此外，提供类必要的构造器，另一个类中使用这些公共方法，计算三角形的面积
 *
 * */
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriAngle t1=new TriAngle(2.0,2.0);
		t1.getArea();
	}

}

class TriAngle{
	private double base;
	private double height;
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	public void getArea() {
		double area=0.5*base*height;
		System.out.println("Area = "+area);
	}
	TriAngle(double base,double height){
		this.base=base;
		this.height=height;
	}
}




