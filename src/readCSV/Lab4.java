package readCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4 {

	public static void main(String[] args) {

		List<String[]> transactions = new ArrayList<String[]>();
		String filename = "C:\\Users\\omar.karamat\\Documents\\eclipse-workspace\\udemytraining\\cardstatement2.csv";
		String dataRow;
		double balance = 0.00;

		try {

			BufferedReader br = new BufferedReader(new FileReader(filename));

			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				transactions.add(line);
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}

		System.out.println("DATE \t |  TYPE \t | vendor \t | amount");
		
		for (String[] transaction : transactions) {
			for (String field : transaction) {
				String date = transaction[0];
				String type = transaction[1];
				String vendor = transaction[2];
				double amount = Double.parseDouble(transaction[3]);
				
				System.out.println(date + "\t | " + type + "\t | " + "\t | " + vendor + "\t | " + amount);

				if (type.equalsIgnoreCase("credit")) {
					System.out.println("Add " + amount + " to balance");
					balance = balance + amount;
				}  
				else if (type.equalsIgnoreCase("debit")) {
					System.out.println("Subtract " + amount + " from balance");
					balance = balance - amount;

				}
				else {
					System.out.println("Other transactions");
				}
				System.out.println("\t\t\t\t\tNew balance is £" + balance + "\n");
			}
			
			if (balance >= 0) {
				System.out.println("You have a balance of: " + balance);
				System.out.println("You are charged a 10% fee of £ " + balance * .10);
				System.out.println("You're new balance is: " + balance*1.1);				
			} else if (balance > 0) {
				System.out.println("Thank you for your payment");
				System.out.println("You have an overpayment of -£ " + balance * .10);
			}
			else {
				System.out.println("Thanks for your payments...");
			}
		}
	}
}