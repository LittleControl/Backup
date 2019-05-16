package top.littlecontrol;

public abstract class Templete {
	public void countTime() {
		long start=System.currentTimeMillis();
		code();
		long end=System.currentTimeMillis();
		System.out.println("Time: "+(end-start));
	}
	
	abstract public void code();
}
