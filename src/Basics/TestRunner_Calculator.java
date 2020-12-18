package Basics;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner_Calculator {

	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(JunitTest_Calculator.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
