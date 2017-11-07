package objectOrientated;

public class BankAccount implements IRate {

	// Define variables
	
	String accountNumber;

	// static variables
	private static final String sortCode = "30-21-22"; // belongs to class not object , final makes it read only not editable, w/o final its amendable via setting value

	//instance variables
	private String name;
	private String niNumber;
	String accountType;
	double balance = 0.00;
	
	// Constructor methods are unique
	// 1. used to define/ set-up / initialise properties of object
	// 2. constructors are IMPLICITLY called upon instantiation  
	// 3. the same name as the class itself
	// 4. Constructors have NO return type
	
	BankAccount(){
		
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	
	BankAccount (String accountType){
		System.out.println("NEW ACCOUNT CREATED: " + accountType);		
	}
	
	BankAccount (String accountType, double initDeposit) {		
		
		System.out.println("NEW ACCOUNT: " + accountType);		
		System.out.println("INITIAL DEPOSIT OF : " + initDeposit);		
		String Msg = null;
		
		// local variables
		
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least £1,000";				
		} else {
			Msg = "Thanks fpr your initial deposit of: £" + initDeposit;					
		}
		System.out.println(Msg);
		balance = initDeposit;
	}

	// OVERLOADING - call same method name with diff arguements
		
	// void deposit()
	//void withdraw(double amount) {
	//balance = balance + amount; 		
	//}
	
	void checkBalance() {	
	System.out.println("Balance: " + balance);
	}
	
// getters and setters because we're using private variables
	// allow user to define the name - not the variable outright - use a public function
	
	// this local variable becomes a global variable
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	
	
	// getStatus()
	
	public String getNiNumber() {
		return niNumber;
	}

	public void setNiNumber(String niNumber) {
		this.niNumber = niNumber;
	}

	@Override
	public String toString(){
		return "{ Name: " + name + " . Account Number: " + accountNumber + " . BALANCE: £" + balance + "}";
		
	}
	
	//interfaces are like contracts
	
	public void setRate() {
		System.out.println("SETTING RATE");		
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");				
	}
	
	// methods
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	public void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	
	// can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Your recent activity: " + activity);
		System.out.println("Your new balance is: " + balance);
	}
	
}
