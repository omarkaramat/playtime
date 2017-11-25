package readCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVBankStatement {

	public static void main(String[] args) {
		
		List<String[]> data = new ArrayList<String[]>();
		
		String filename = "C:\\Users\\omar.karamat\\Documents\\eclipse-workspace\\udemytraining\\cardstatement.csv";
		
		String dataRow;
		
		Double balance = 0.00;

		try {

			BufferedReader br = new BufferedReader(new FileReader(filename));

			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				data.add(line);
			}
		// added by me 
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}

		for (String[] account : data) {
			
			
	System.out.println("DATE: " + account[0] + "\nOPERATION: " + account[1] + "\nRETAILER: " + account[2] + "\nAMOUNT: " + account[3] + "\n");
			
			double doubleAmount = Double.parseDouble(account[3]);
			
			if (account[1].contains("CREDIT")) {
				balance = balance + doubleAmount;
				//System.out.print("CREDIT found");
			} else if (account[1].contains("DEBIT")) {
				balance = balance - doubleAmount;
				//System.out.print("DEBIT found");
			} 
		}

		if ( balance >= 0.00) {
			balance = balance - (balance / 10);
			System.out.println("WARNING!");
			System.out.println("Your balance: " + balance);
		} else if (balance < 0.0) {
			System.out.println("Thank fot your payments!");
			System.out.println("Your balance: " + balance);
		}
	}

}
