package new03;

public class Account {
	
	private int id;
	private double balance;
	private double annualIntersetRate;
	public Account(int id,double balance,double annualIntersetRate) {
		this.id=id;
		this.balance=balance;
		this.annualIntersetRate=annualIntersetRate;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getAnnualIntersetRate() {
		return this.annualIntersetRate;
	}
	public void setAnnualIntersetRate(double annualIntersetRate) {
		this.annualIntersetRate=annualIntersetRate;
	}
	//在提款方法中withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
	public void withdraw(double amount) {//取钱
		if(balance<amount) {
			System.out.println("Sorrry,your balance is not enough");
		}else {
			balance-=amount;
			System.out.println("Withdraw Successfully!");
		}
	}
	public void deposit(double amount) {//存钱
		System.out.println("your current is "+balance);
		balance+=amount;
		System.out.println("Deposit Successfully,now your balance is "+balance);
	}
}
