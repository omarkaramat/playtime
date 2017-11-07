package objectOrientated;

public class AccountApp {
	
	public static void main(String[] args){
		LoanAccount la = new LoanAccount();
		la.setRate();
		la.increaseRate();
		la.setTerm(20);
		la.setAmmortSchedule();
		
		// Polymorphism - repointing methods available
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
		
	}

}
