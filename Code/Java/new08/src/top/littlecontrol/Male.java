package top.littlecontrol;

class Male extends Person{
	int age=18;
	@Override
	public void say() {
		System.out.println("I'm a man!");
	}
	public void Fly() {
		System.out.println("I can Fly!");
	}
	@Override
	public void show() {
		System.out.println(this.age);
	}
}
