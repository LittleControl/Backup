package com.littlecontrol.top;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		PassObject p1=new PassObject();
		p1.printArea(c1, 6);
	}

}
class Circle{
	double radius;
	public double findArea(double radius) {
		this.radius=radius;
		double area=Math.PI*radius*radius;
		return area;
	}
}
class PassObject{
	public void printArea(Circle c,int time) {
		System.out.println("Radius"+"\t\t\t"+"Area");
		for(int i=1;i<=time;i++) {
			double area=c.findArea(i);
			System.out.println(c.radius+"  \t\t\t"+area);
		}
		System.out.println("now radius is : "+c.radius);
	}
}







