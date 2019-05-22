package littlecontrol.top;

import org.junit.jupiter.api.Test;

public class Finally {
	@Test
	public void test() {
		try {
			int[] arr=new int[10];
			System.out.println(arr[10]);
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("I must be taken !");
		}
	}
}
