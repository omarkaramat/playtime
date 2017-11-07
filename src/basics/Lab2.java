package basics;

public class Lab2 {

	public static void main(String[] args) {

		// Write a function that computes factorial - using recursion

		System.out.println("Factorial of 5 is: " + fact(5));
		
	}
	
	// recursive function until n is 0
	
		public static int fact(int n){	
			
			if (n == 0) {
				return 1;
			}
			
			System.out.println("n value is: " + n);			
			return fact(n-1) * n;
			
		}
}
