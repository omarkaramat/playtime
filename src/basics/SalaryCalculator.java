package basics;

public class SalaryCalculator {
	public static void main(String[] args){
		
		// Declare variable
		String career;
		System.out.println("Program is starting");
		
		// Defined a variable 
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		// Declare and define 
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salary as a " + career + " at the rate of " + rate + " is $" + salary + " per year");
	}
}
