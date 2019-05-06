package new02;

public class PrivateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private p1=new Private();
		p1.name="LittleControl";
		System.out.println(p1.name);
//		p1.age=20;
//		System.out.println(p1.age);
	}
}
class Private{
	String name;
	private int age;
	boolean isMale;
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
}
