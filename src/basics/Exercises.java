package basics;

public class Exercises {

	public static void main(String[] args) {

		System.out.println("0 returns sum of " + sum(0));
		System.out.println("1 returns sum of " + sum(1));
		System.out.println("10 returns sum of " + sum(10));

		System.out.println("0 returns sum of " + factorial(0));
		System.out.println("1 returns sum of " + factorial(1));
		System.out.println("10 returns sum of " + factorial(10));

		int[] array = new int[5];
		array[0] = 5;
		array[1] = 15;
		array[2] = 25;
		array[3] = 35;
		array[4] = 45;
				  
		//printing array  
		for(int i=0;i<array.length;i++)
		System.out.println(array[i]);  
		
		System.out.println("Maximum of array is " + findMax(array)); 
		System.out.println("Minimum of array is " + findMin(array)); 
		System.out.println("Average of array is " + findAvg(array)); 
	
	}
	
	public static int sum(int maxValue){
		
	int sum = 0;
	
		for(int i=1; i<=maxValue;i++){
		
			sum = sum+i;
		
		}
		
		return sum;
	}
	
	public static int factorial(int n) {
	    if (n == 0) {
	        return 1;
	    }
	    else if (n == 1) {
	        return 1;
	    }
	    return factorial(n-1) * n;
	}
		  
	public static int findMax(int[] arr) {

		int max = arr[0];
	    
	    int i;

	    for (i = 0; i < arr.length; i++) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	    }
	    return max;
	}
	 
	public static int findMin(int[] arr) {
	    int min = arr[0];
	    
	    int i;
	    
	    for (i = 0; i < arr.length; i++) {
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	    }
	    return min;
	}

	
	public static int findAvg(int[] arr) {
	    int sum = 0;

	   // int i;

	    for (int i = 0; i < arr.length; i++) {
	        sum = sum + arr[i];
	    }
	    return sum / arr.length;
	}
	
}
