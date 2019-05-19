package littlecontrol.top;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ExceptionTest {
	@Test
	public void Test1() {
		String name="123";
		name="abc";
		int num=0;
		try {
			num=Integer.parseInt(name);
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(num);
	}
}
