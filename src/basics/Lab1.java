package basics;

public class Lab1 {

	public static void main(String[] args) {

		// Write a function that takes a value and returns the sum of 1 to n
		System.out.println(sum(5));
		
	}
	
		public static int sum(int n){	

		int sum = 0;
		
		for (int i=1; i <= n; i++) {
		
		System.out.println(sum + " + " +  i);
			
				sum = sum + i;	
			}
		
		return sum;
	
		}
}
