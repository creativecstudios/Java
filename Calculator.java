package Basics;

public class Calculator {

	static int num1,num2,num3,num4,avg;
	static int average(int number1,int number2, int number3)
	{
		num1 = number1;
		num2 = number2; 
		num3 = number3;
		avg = (num1+num2+num3)/3;
		return avg;
	}
	static int average (int number1,int number2,int number3,int number4)
	{
		num1 = number1;
		num2 = number2; 
		num3 = number3;
		num4 = number4;
		avg = (num1+num2+num3+num4)/4;
		return avg;
	}
	
	public static void main(String args[])
	{
		System.out.println(average(2,4,3));
		System.out.println(average(3,5,2,5));
	}
}
