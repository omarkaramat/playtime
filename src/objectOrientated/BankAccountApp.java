package objectOrientated;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "276276281";
		// acc1.name = "Omar Karamat";
		
		acc1.setRate();
		acc1.increaseRate();

		acc1.setName("Roger");
		System.out.println("Mr " + acc1.getName());		

		acc1.setNiNumber("2132333232");
		System.out.println("NI Number: " + acc1.getNiNumber());		

		
		acc1.balance = 100;
		acc1.deposit(21.33);
		acc1.deposit(222.30);
		acc1.deposit(100.00);
		acc1.withdraw(200);
		
		// Polymorphism through overring 
		
		System.out.println(acc1.toString());		
		
		
		// Polymorphism through overloading 
		
		/*
		BankAccount acc2 = new BankAccount("Checking account"); 
		BankAccount acc3 = new BankAccount("Saving Account",12.33); 
		System.out.println(acc1.sortCode);
		System.out.println(acc2.sortCode);
		System.out.println(acc3.sortCode);
		
		
		acc3.checkBalance();
		
		// Demo for inheritance 
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Omar Karamat";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.computeInterest();
*/	
	}
	
}
