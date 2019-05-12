package top.littlecontrol;

class Female extends Person{
	int age=20;
	public void shopping() {
		System.out.println("I like shopping!");
	}
	@Override
	public void say() {
		System.out.println("I'm a Women");
	}
}
