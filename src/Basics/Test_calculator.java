package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Basics.Calculator;

public class Test_calculator extends Calculator {

	 Test_calculator ref = new Test_calculator();
	
	 @Test
	 public void average() {
		 assertEquals(2,ref.average(2,2));
		 assertEquals(0,ref.average(-2,2));
	 }
	 @Test
	 public void lcm() {
		 assertEquals(6,ref.leastCommonMultiple(2,3));
		 assertEquals(6,ref.leastCommonMultiple(2,0,3));
		 assertEquals(6,ref.leastCommonMultiple(2,3,0));
		 assertEquals(6,ref.leastCommonMultiple(0,2,3));
	 }
	 @Test
	 public void hcf() {
		 assertEquals(2,ref.highestCommonFactor(4,2));
		 assertEquals(2,ref.highestCommonFactor(0,2));
	 }
	 
	 
}