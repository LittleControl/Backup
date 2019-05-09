package new06;

class Student extends Person {
	String major;
	public String getMajor() {
		return major;
	}
	Student(){
		
	};
	Student(String name,int age,boolean isMale,String major){
		this.setName(name);
		this.setAge(age);
		this.setMale(isMale);
		this.major=major;
	}
}
