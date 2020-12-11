package Basics;

public class Calculator {
	private int average(int num1,int num2, int num3)
	{
		return((num1+num2+num3)/3);
	}
	private int average (int...num1)
	{
		int sum=0;
		int count=0;
		for(int i:num1)
		{
			sum=sum+i;
			count++;
		}
		retrun(sum/count);
	}
}
