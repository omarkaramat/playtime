package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordLabByTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename = "C:\\Users\\omar.karamat\\Documents\\eclipse-workspace\\udemytraining\\passwordsToTest.txt";
		String[] passwords = new String[15];

		File file = new File(filename);

		try {
			BufferedReader br = new BufferedReader (new FileReader(file));
			for (int i=0;i<passwords.length;i++){
				passwords[i] = br.readLine();
			}
		} catch (FileNotFoundException e) {  System.out.println("ERROR: CANNOT OPEN FILE");
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (IOException e) { System.out.println("ERROR: CANNOT READ FILE");
			// TODO Auto-generated catch block
	//		e.printStackTrace();
		}
		
		for (String password : passwords) {
			System.out.println("**********************" +password);
			
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			boolean hasInvalidChar = false;
			
			for (int n=0; n<password.length();n++) {
				//condition 1 : contains number
				
				if ("0123456789".contains(password.substring(n,n+1))) {
					//System.out.println("Position : " + n + " contains a number");
					hasNumber = true;
				} 
				else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n,n+1).toLowerCase())) {
					//System.out.println("Position : " + n + " contains a letter");
					hasLetter = true;
				} 
				else if ("¬!£$%^&*()".contains(password.substring(n,n+1))) {
				//	System.out.println("Position : " + n + " contains a special char");
					hasSpecialChar = true;
				} 
				else {
					try { throw new InvalidCharException(password.substring(n,n+1));
					} catch (InvalidCharException e) { e.toString();}
				}
			}
			
			if (!hasLetter || !hasSpecialChar) {
				// Throw criteria error 
				System.out.println("Missing criteria");
			} else if (!hasNumber) {
				try {
					throw new NumberCriteriaException(password);
				} catch (NumberCriteriaException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("NumberCriteriaException: " + password);
				}
			}
			else {
				System.out.println("Valid password");				
			}
		}
		
	}
}	
	class InvalidCharException extends Exception{

		String ch;
		public InvalidCharException(String ch) {
			this.ch=ch;
		}
		public String toString() {
			return "InvalidCharException: " + ch;
	}
}
	
	class NumberCriteriaException extends Exception{

		String password;
		public NumberCriteriaException(String password) {
			this.password=password;
		}
		public String toString() {
			return "NumberCriteriaException: " + password;
	}
}