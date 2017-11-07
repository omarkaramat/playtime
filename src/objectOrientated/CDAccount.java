package objectOrientated;

public class CDAccount extends BankAccount implements IRate {

	String interestRate;
	
	void computeInterest() {
	
		System.out.println("Compounding interest");

	}

}
