package top.littlecontrol2;

public class Block_Test3 {
	public static void main(String[] args) {
		Order0 o0=new Order0();
		Order1 o1=new Order1();
		System.out.println(o0.age);
		System.out.println(o1.age);
	}
}
class Order0{
    int age=10;
    {
        age=20;
    }
}
class Order1{
    {
        age=20;//这样写并没有错误，及时age的声明在其之后
    }
    int age=10;
}