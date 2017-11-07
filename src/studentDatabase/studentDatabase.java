package studentDatabase;

import java.util.Random;

/**
 * 
 * + New Student constructor that takes name and SSN in the arguments
 * + Automatically create an email ID based on the name
 * + Set a private static ID
 * - Generate a user ID that is combination of 
 * 	+ Static ID, 
 * 	+ random 4-digit number between 1000 and 9000
 *  + and last 4 of SSN
 * - Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
 * + Use encapsulation to set variables (phone, city, state)
 *
 */

public class studentDatabase {

	public static void main(String[] args) {

	Student student1 = new Student("omar karamat", "NI1234566");

	student1.setEmailAddress();		
	student1.setUserId();
	student1.setPhone("07982225551");
	student1.setCity("Bristol");
	student1.setState("South West");
	
	
	System.out.println(student1.toString());
	
	}	
}
	
class Student {
	
// Properties
	
	private String name;
	private String email_address;
	public String emailDomain = "@ambercomputers.com";
	private String ssn;
	private String user_id;
	private String phone;
	private String city;
	private String state;
	private static final String iD = "12345";	
	
	// Constructors 
	
	public Student(String name, String ssn) {

	this.name = name;
	this.ssn = ssn;
	}
	
	public void setPhone(String phone) {	
		this.phone = phone;
	}

	public void setCity(String city) {	
		this.city = city;
	}

	public void setState(String state) {	
		this.state = state;
	}
	
	public void setEmailAddress() {

		String nameNoSpaces = name.replaceAll("\\s","");	
		email_address = nameNoSpaces + emailDomain;
		// System.out.println("Email address generated is: " + email_address);
	}

	public void setUserId() {
		
		String partOfStaticId = iD.substring(0,3);			
		String lastFourSSN = ssn.substring(ssn.length()-4,ssn.length());

		// random 4-digit number between 1000 and 9000
		Random randomNumber = new Random();
		int randomNumberForId = randomNumber.nextInt((9000 - 1000) + 1) + 1000;
				
		// System.out.println("Random number generated is: " + randomNumberForId);
		// System.out.println("ID is " + iD + " so part used in user ID is: " + partOfStaticId);
		// System.out.println("ssn is " + ssn + " so part used in user ID is: " + lastFourSSN);
		
		user_id = randomNumberForId + partOfStaticId + randomNumberForId;
		
		// System.out.println("User Id generated is: " + user_id);
	
	}

	
// Methods 

public void enroll(){

	//TODO
	System.out.println("This is the enroll method");
}

public void pay(){

	//TODO
	System.out.println("This is the pay method");
}

public void checkBalance(){

	//TODO
	System.out.println("This is the enroll method");
}

public void showCourses(){

	//TODO
	System.out.println("This is the showCourses method");
}

@Override
public String toString() {
	return "[Name]: " + name + "\n[SSN]: " + ssn + "\n[Email]: " + email_address + "\n[UserId]: " + user_id + "\n[Phone]: " + phone + "\n[City]: " + city + "\n[State]: " + state;
}

}

