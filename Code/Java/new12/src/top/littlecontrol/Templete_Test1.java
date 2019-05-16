package top.littlecontrol;

public class Templete_Test1 extends Templete{
	public static void main(String[] args) {
		Templete_Test1 tt1=new Templete_Test1();
		tt1.countTime();
	}
	@Override
	public void code() {
		// TODO Auto-generated method stub
		for(int i=2;i<100;i++) {
			boolean isPrime=true;
			for(int j=2;j<Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+"\t");
			}
		}
		System.out.println();
	}
}
