package new03;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("Little","Control");
		Account a1=new Account(0,23.33,0.04);
		c1.setAccount(a1);
		System.out.println(c1.getAccount().getId());
		a1.setId(1);
		System.out.println(c1.getAccount().getId());
	}

}
