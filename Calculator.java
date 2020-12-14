package Basics;

import java.util.Arrays;

public class Calculator {
	
	int average(int num1,int num2, int num3)
	{
		int result = ((num1+num2+num3)/3);
		System.out.println("The average of 3 num is "+ result);
		return result;
	}
	//variable parameter
    int average(int...num1)
	{
		 int count=0;
		 int sum=0;
		for(int i:num1)
		{
			sum = sum+i;
			count++;
		}
		int result = sum/count;
		System.out.println("The average of n numbers is "+result);
		return(result);
	}
    int highestCommonFactor(int...inputs)
	{
		//To store the input into the array
		int input = 0;
		int arr[] = new int[inputs.length];
		for(int j: inputs)
		{
			arr[input] = j;
			input++;
		}
		//Highest common factor
		int result = 0;
		for(int i=0; i<arr.length-1; i++)
		{
			while(arr[i+1]>0)
			{
				int temp = arr[i+1];
				arr[i+1]= arr[i]%arr[i+1];
				arr[i]= temp;
				result = arr[i];
			}
			arr[i+1]= result;
		}
		System.out.println("The Highest Common Factor is "+result);
		return result;
	}
    int leastCommonMultiple(int...inputs)
    {
    	int input=0;
    	int arr[] = new int[inputs.length];
    	for(int i: inputs)
    	{
    		arr[input] = i;
    		input++;
    	}
    	Arrays.sort(arr);
    	int length = arr.length;
    	int max = arr[length-1];
    	int min = arr[0];
    	int lcm = 0;
    	int dummy=0;
    	//lcm
    	for(int i=0; i<length-1; i++)
		{
    	while(true)
    	{
    		if(arr[i]%max == 0)
    		{
    			lcm = max;
    			break;
    		}
    		++max;
    		dummy = max;
    		max = dummy;
    	}
    	max= dummy;
		}
    	System.out.println("the lcm is "+max);
    	return max;
    }
}

//To find the maximum number in the array
//int max = arr[0];
//for(int k=1; k<arr.length; k++)
//{
//	if(arr[k]>max)
//		max = arr[k];
//}
//int highestCommonFactor(int...inputs)
//{
//	int hcf =0; 
//	//To store the input into the array
//	int input = 0;
//	int arr[] = new int[inputs.length];
//	for(int j: inputs)
//	{
//		arr[input] = j;
//		input++;
//	}
//	//Highest common factor
//	int result = hcf(arr[0],arr[1]);
//	for(int i=2; i<arr.length; i++)
//	{
//		result = hcf(result,arr[i]);
//	}
//	return result;
//}
////Highest common factor for 2 numbers
//int hcf(int a,int b)
//{
//	while(b>0)
//	{
//		int temp = b;
//		b=a%b;
//		a=temp;
//	}
//	return a;
//}	

