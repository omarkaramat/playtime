package exceptions;

public class NegativePaymentException extends Exception {

	double payment;
	
	public NegativePaymentException(double payment){
	//System.out.println("ERROR: Negative payment");
	
		this.payment = payment;
	
	}
	
	public String toString() {
	return "Error: Cannot take negative payment of " + payment;
	}
}