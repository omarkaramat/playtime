package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ValidatePasswordApp {

	public static void main(String[] args) {

		String passwordFile = "C:\\Users\\omar.karamat\\Documents\\eclipse-workspace\\udemytraining\\passwordsToTest.txt";

		File file = new File(passwordFile);
		String[] passwordInFile = new String[15];
		
		String password = null; 
		
		try {
		
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<passwordInFile.length; i++) {
				passwordInFile[i] = br.readLine();
			}
				
				br.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("ERROR: Password file not found");

			} catch (IOException e) {
				System.out.println("ERROR: Could not read from password file");
		}
		
 		for (int i=0; i<passwordInFile.length; i++) {
			password = passwordInFile[i];
			// System.out.println("Reading password line " + (i+1) + ": " + password);
						
				if (password.matches("[a-zA-Z0-9!@#]{0,20}")) {
					System.out.println("Found alphanumeric values on line " + (i+1));
				}
				
				try {
					
				if (password.length() !=10) {
					throw new TenDigitException(password);
				}
				
				if (password.contains(":")) {
			//		throw new ContainsSpecialChar(password);
					System.out.println(": found");					
				}
				
				} catch(TenDigitException e) {
					System.out.println("Error: Password is not 10 digits");
					System.out.println(e.toString());
 				//} catch(ContainsColon e) {
 				//	System.out.println("Error: Password contains colon");
 				//	System.out.println(e.toString());
 				}
 		}		

	}
}

	class TenDigitPassword extends Exception{
		
		String password;
		
		void TenDigitException(String password) {
			this.password = password;
		}
		
		public String toString() {
			return("TenDigitException: " + password);
		}
	}

	class ContainsSpecialChar extends Exception{
		
		String password;
		
		void ContainsColon(String password) {
			this.password = password;
		}
		
		public String toString() {
			return("ContainsColon: " + password);
		}
	}

	
		// Create and throw the appropriate exception when password criteria is not met 
			