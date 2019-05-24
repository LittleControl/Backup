package top.littlecontrol;

public class Army {
	int id;
	String name;
	String career;
	int money;
	boolean status=true;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	Army(){
		
	}
	Army(int id,String name,String career,int money,boolean status){
		this.id=id;
		this.name=name;
		this.career=career;
		this.money=money;
		this.status=status;
	}
}
