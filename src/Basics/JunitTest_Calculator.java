package Basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest_Calculator {

	Calculator ref = new Calculator();
	@Test
	public void test()
	{
		assertEquals(2,ref.average(2,2));
	}
	
}
