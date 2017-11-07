package basics;

public class FibonnachiApp {

	public static void main(String[] args) {

		// Fibonnaci number is defined by the sum of the 2 previous Finonnchi numbers
		// Fib(0) = 0 
		// Fib(1) = 1 
		// Fib(2) = 1
		// Fib(3) = 2 
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
		System.out.println(fib(5));
	}
	
	public static int fib(int n){
		if (n == 0) {
			return 0;
		} 
		else if (n == 1) {
			return 1;
		}
	return (fib(n-1) + fib(n-2)); 
		}
}

