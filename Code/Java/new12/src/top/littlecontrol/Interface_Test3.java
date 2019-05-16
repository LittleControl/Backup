package top.littlecontrol;

public class Interface_Test3 {

}
interface Smallball{
	void play();
}
interface Bigball{
	void play();
}
interface Midball extends Smallball,Bigball{
	Ball ball=new Ball("球球大作战!");
}
class Ball implements Midball{
	Ball(String name){
		System.out.println(name);
	}
	@Override
	public void play() {//由于Smallball和Bigball的两个方法重名了,所以这里相当于对两个方法都进行了重写
//		ball=new Ball("火舞旋风!");//接口中定义的变量都是public static final的,这里ball被final修饰,不可修改
		System.out.println("大家好.我是Littlecontrol!");
	}
}
