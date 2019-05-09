package new06;

class Person {
	private String name;
	private int age;
	private boolean isMale;
	Person(){
		this.name="LittleControl";
		this.age=19;
		this.isMale=true;
	}
	Person(String name,int age,boolean isMale){
		this.name=name;
		this.age=age;
		this.isMale=isMale;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public boolean getMale() {
		return this.isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale=isMale;
	}
}






