package Basics;

public class Calculator {
	
    int average(int num1,int num2, int num3){
        int result = ((num1+num2+num3)/3);
        System.out.println("The average of 3 num is "+ result);
	return result;
    }
	//variable parameter
    int average(int...num1){
    	int count=0;
    	int sum=0;
	for(int i:num1){
		sum = sum+i;
		count++;
	}
	int result = sum/count;
	System.out.println("The average of n numbers is "+result);
	return(result);
    }
 
    int highestCommonFactor(int...inputs){
	int result = 0;
	for(int i = 0; i<inputs.length-1; i++){
		while(inputs[i+1]>0){
			int temp = inputs[i+1];
			inputs[i+1]= inputs[i]%inputs[i+1];
			inputs[i]= temp;
			result = inputs[i];
			}
		inputs[i+1]= result;
		}
	System.out.println("The Highest Common Factor is "+result);
	return result;
    }
    
    int leastCommonMultiple(int...inputs){
    	int max;
    	int min;
    	int x;
    	int lcm = 0;
        for(int i = 0; i<inputs.length; i++){
        	for(int j=0; j<inputs.length-1; j++) {
        		if(inputs[i]>inputs[j]) {
        			max = inputs[i];
        			min = inputs[j];
        		}else {
        			max = inputs[j];
        			min = inputs[i];
        		}
        		for(int k=0; k<inputs.length; k++) {
        			if((max!=0) & (min!=0)) {
        				x = k*max;
        				if(x%min==0) {
        					lcm = x;
        				}
        			}
        		}
        	}	
        }
	System.out.println("The Least Common Multiple is "+lcm);
        return lcm;
    }
}



