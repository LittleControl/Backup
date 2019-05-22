package littlecontrol.top;

public class HandThrow {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void method1() throws Exception {
		int[] arr=new int[10];
		int i=10;
		if(i<10) {
			System.out.println(arr[10]);
		}else {
			throw new Exception();
		}
		
	}
}
