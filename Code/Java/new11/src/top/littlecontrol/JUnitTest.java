package top.littlecontrol;

import org.junit.jupiter.api.Test;

public class JUnitTest {
	@Test
	public void Single1() {
		SingleOne so1=SingleOne.getObj();
		SingleOne so2=SingleOne.getObj();
		System.out.println(so1==so2);
	}
	@Test
	public void Single2() {
		SingleTwo st1=SingleTwo.getObj();
		SingleTwo st2=SingleTwo.getObj();
		System.out.println(st1==st2);
	}
}
