package top.littlecontrol;

import org.junit.Test;

public class JUnitTest {
	@Test
	public void testUnit() {
		int num=10;
        @SuppressWarnings("deprecation")
		Integer i1=new Integer(num);
        System.out.println(i1.toString());
        @SuppressWarnings("deprecation")
		Integer in1=new Integer(20);
        int num2=in1.intValue();
        System.out.println(num2);
	}
	@Test
	public void intToInteger() {
		int num1=0;
        Integer in1=num1;
        System.out.println(in1);//0
        Integer in2=123;
        int num2=in2;
        System.out.println(num2);//123
    }
	@Test
	public void intToString() {
		int i=123;
		String str=String.valueOf(i);
		System.out.println(str);
	}
	@Test
	public void stringToInt() {
		String str1="123";
		int num1=Integer.parseInt(str1);
		System.out.println(num1);
	}
	@Test
	public void packToString() {
		Integer in1=123;
		String str1=in1.toString();
		System.out.println(str1);
		Integer in2=new Integer(str1);
		System.out.println(in2);
	}
	@Test
	public void packApp() {
		Object o1=true?new Integer(1):new Double(2.0);
		Object o2;
		if(true) {
			o2=new Integer(1);
		}else {
			o2=new Double(2.0);
		}
		System.out.println(o1);
		System.out.println(o2);
	}
}












