package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		
		int product = multiplyNumbers(numA,numB);
		System.out.println("Product is: " + product);
		
		// System.out.println("Product is: " + multiplyNumbers(numA,numB));
		
		
		
	}
			
	static void printName() {
	System.out.println("My name is Omar");
	}

	static void addNumbers(int numberA, int numberB) {
		//This function will add two numbers 
		int sum = numberA + numberB;
		System.out.println("The sum of numbers : " + numberA + " and " + numberB );
		System.out.println(sum);
		
		// void is no return
	}
	
	static int	multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		
		addNumbers(product + 50, product);

		return product;
	}
}