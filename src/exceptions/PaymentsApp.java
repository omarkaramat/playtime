package exceptions;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class PaymentsApp {

	// Take a payment from a user 
	public static void main(String[] args) {

		double payment=0;
		boolean positivePayment = true;
		
	// 1. Ask the user for input


	do {

		System.out.print("Enter the payment out: ");	
		// print - allows input on same line so new line is created
		
		// 2. Get the amount and test the value
		Scanner in = new Scanner(System.in);
		
		// 3. Handle exceptions appropriately 
		try {
			payment = in.nextDouble();
			if (payment < 0) {
				throw new NegativePaymentException(payment);
			}
			else {
				positivePayment=true;
			}
		} catch (NegativePaymentException e) {
			System.out.println(e.toString());
			System.out.println("Please try again");
			positivePayment = false;
		}
	} while(!positivePayment);	
	
	// 4. Print the confirmation 

	System.out.println("Thank you for payment of £" + payment);
	}
}