package new06;

class Cat extends Animal{
	public void sayHello() {
		System.out.println("Don't say hello java to me!");
	}
	public void sayHello(String name) {
		System.out.println("Hello,Overwrite!"+name);
	}
}
