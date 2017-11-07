package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("6768668222", 1000);

		BankAccount acc2 = new BankAccount("8798798377", 2275);
		BankAccount acc3 = new BankAccount("7737837387", 3000);
		
		acc1.setName("Omar");
		acc1.payBill(120);
		acc1.makeDeposit(10);
		acc1.makeDeposit(20);
		acc1.makeDeposit(5);
		acc1.accrue();
		System.out.println("Name is " + acc1.getName());

		System.out.println(acc1.toString());
		
	}

}

class BankAccount implements IInterest {
	
	// Properties of bank account - only available via methods 
	
	private static int iD = 1001; // internal ID belonging to class 
	private String accountNumber; // iD + random 2-digit number + first 2 of nationalInsuranceNumber
	private static final String sortCode = "123456";
	private String name;
	private String nationalInsuranceNumber;
	private double balance;
	
	// Constructors 
	
	public BankAccount(String nationalInsuranceNumber, double initDeposit) {
		balance = initDeposit;
		System.out.println("New account created - iD starts with " + iD);
		this.nationalInsuranceNumber = nationalInsuranceNumber;
		iD++;

		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		System.out.println("Random is: " + random);

		accountNumber = iD + "" + random + "" + nationalInsuranceNumber.substring(0,2);
		System.out.println("Account number is: " + accountNumber);

	}

	public void setName(String name) {	
		// instance variable = local variable
		this.name = name;
	}

	public String getName() {	

		return name;
	}

	public void payBill(double amount) {
		
		System.out.println("Prev balance: " + balance);
		balance = balance-amount;		
		System.out.println("Latest balance: " + balance);

	}

	public void makeDeposit(double amount) {
		
		System.out.println("Prev balance: " + balance);
		balance = balance+amount;		
		System.out.println("Latest balance: " + balance);
	}

	public void showBalance() {
		
		System.out.println("Current balance: " + balance);
	}

	@Override
	public void accrue(){
		balance = balance * (1 + rate/100);
		System.out.println("New bal after interest is: " + balance);
		System.out.println("Interest was: " + rate + "%");
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n[NI Number:" + nationalInsuranceNumber + "]\n[Balance: " + balance + "]";

	}
	
}