package studentDatabase;

public class Lab2 {
	
	public static void main(String[] args) {

		
		
		Studento stu1 = new Studento("Omar","89739873982");	
//		Studento stu2 = new Studento("Kade","3982333333");	
//		Studento stu3 = new Studento("Leila","1119822221");	
	
		stu1.enroll("Math 101");
		stu1.enroll("History of World War II");
		stu1.enroll("Science");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		
		System.out.print(stu1.toString());
		
		stu1.getEmail();
	}
}

class Studento {
	
	//Properties
	
	private static int iD=1000;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	public String getPhone() {
		return phone;
	}


	public String courses;
	private static final int costOfCourse = 800;
	private int balance = 0;
	public Studento(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
		courses = "";
		
		
	}

	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@karso.com";
		System.out.println("Your email: " + email);
	}
	
	public String getEmail(){
		return email;
	}
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		
//		int random = (int) (Math.random() * 10000);
		int random = (int) (Math.random() * ((max-min)));
		random = random + min;
		userId = iD + "" + random + "" + min;
		System.out.println(random);
		System.out.println(userId);
		
	}
	
	public void enroll(String course){
//	this.courses = course;
	
	this.courses = this.courses + "\n" + course;
	System.out.print(courses);
	balance = balance + costOfCourse;
	
	}

	public void payTuition(int amount){
	
	balance = balance - amount;	
	System.out.print("Paid: £" + amount);
		
	}

	public void checkBalance(){
		System.out.print("Balance £: " + balance);
		
	}

	public void showCourses(){
		System.out.print("Courses: " + courses);
		
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
@Override
public String toString(){	

	return "NAME: " + name + "\nCOURSES: " + courses + "\nBALANCE: " + balance;
			
	}

}
