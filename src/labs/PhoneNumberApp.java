package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {

		// 1. Read phone numbers from file 
		// 2. Valid phone number is:
			// 10 digits long 
			// Area code cannot start in 0 or 9
			// There can be 911 in the phone

		String filename = "C:\\Users\\omar.karamat\\Documents\\eclipse-workspace\\udemytraining\\PhoneNumber.txt";
		File file = new File(filename);

		String[] phoneNums = new String[9];
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<phoneNums.length; i++) {
				phoneNums[i] = br.readLine();
			}
			br.close();
			} catch (FileNotFoundException e) {
				System.out.println("ERROR: file not found");
			//	e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("ERROR: could not read from file");
				//e.printStackTrace();
			}
		
		
		for (int i=0; i<phoneNums.length; i++) {
			phoneNum = phoneNums[i];
		try {
			
			if (phoneNum.length() !=10) {
				throw new TenDigitException(phoneNum);
			}
		
			if ((phoneNum.substring(0,1).equals("0")) || (phoneNum.substring(0,1)).equals("8")) {
				throw new AreaCodeException(phoneNum);
			}
			
			for (int n=0;n<phoneNum.length()-2;n++){
				if (phoneNum.substring(n, (n+1)).equals("9")){
					if (phoneNum.substring(n+1,n+3).equals("11")){
						throw new EmergencyException(phoneNum);
						
					}
				}
			}
				
			System.out.println(phoneNum);

		} catch(TenDigitException e) {
			System.out.println("Error: Phone number is not 10 digits");
			System.out.println(e.toString());
		} catch (AreaCodeException e) {
			System.out.println("Error: Phone number doesn't start with 0 or 9");
			System.out.println(e.toString());
		//e.printStackTrace();
		} catch (EmergencyException e) {
			System.out.println("Error: 911 found as number");
			System.out.println(e.toString());
		//e.printStackTrace();
		}
	}	
	}
}
	class TenDigitException extends Exception{
		
		String num;
		
		TenDigitException(String num) {
			this.num = num;
		}
		
		public String toString() {
			return("TenDigitException: " + num);
		}
		
	}

	class AreaCodeException extends Exception{
	
	String num;
		
		AreaCodeException(String num) {
			this.num = num;
		}
		
		public String toString() {
			return("AreaCodeException: " + num);
		}
		

		
	}
	
	class EmergencyException extends Exception {		
	String num;
		
	EmergencyException(String num) {
			this.num = num;
		}
		
		public String toString() {
			return("EmergencyException: " + num);
		}

	}


	//String filename = "C:\\Users\\omar.karamat\\Documents\\eclipse-workspace\\udemytraining\\PhoneNumber.txt";
	//File file = new File(filename);
	//BufferedReader br = new BufferedReader(new FileReader(file));
	