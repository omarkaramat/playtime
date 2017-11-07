package basics;

public class Lab3 {

	public static void main(String[] args) {

		// Write a function that returns min, max and avg of an array 

		// create array
		int[] numbers ={5,10,15,20,25};
		
		System.out.println("Array min is: " + findMin(numbers));
		System.out.println("Array min is: " + findMax(numbers));
		System.out.println("Array ave is: " + findAve(numbers));
		
	}
		
		public static int findMin(int[] arr){	
	
			//initialise array
			int min = arr[0];
			
			for (int i = 0;i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			return min;
		}
		
		public static int findMax(int[] arr){	
			
			//initialise array
			int max = arr[0];
			
			for (int i = 0;i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			return max;

		}

		public static int findAve(int[] arr){	

			int sum = 0;
			
			for (int n=0; n < arr.length; n++) {
				sum = sum + arr[n];
			}
			System.out.println("Sum is: " + sum);
			
			return sum/arr.length;
		}		
}
