package studentDatabase;

public class Assignment {

public static void main(String[] args) {

StudentDB sd1 = new StudentDB("Jon", "124534628");
sd1.setPhone("+37011122264");
sd1.setCity("Los Angeles");
sd1.setState("California");
sd1.setBalance(5000);
sd1.enroll("Java", "Is", "The", "Best");
sd1.pay(100);
sd1.checkBalance();
System.out.println(sd1.toString());
sd1.showCourses();
}

}

class StudentDB {

private String SSN;
private String name;
private String email;
private String phone;
private String city;
private String state;
static private int iD = 1000;
private String userID;
private double balance;

private String courseOne;
private String courseTwo;
private String courseThree;
private String courseFour;

StudentDB(String name, String SSN) {
this.name = name;
this.SSN = SSN;
email = name + "@University.com";
iD++;
iDgenerator();
}

private void iDgenerator() {
int random;
random = (int) (Math.random() * 10000);
boolean state = false;
do {
if (random < 1000 || random > 9000) {
random = (int) (Math.random() * 10000);
} else {
state = true;
}
} while (!state);
userID = iD + "" + random + SSN.substring(5, 9);
}

public void enroll(String one, String two, String three, String four) {
courseOne = one;
courseTwo = two;
courseThree = three;
courseFour = four;
}

public void pay(double amount) {
balance = balance - amount;
}

public void checkBalance() {
System.out.println("Your balance is: " + balance);
}

public void showCourses() {
System.out.println("Your courses are: ");
System.out.println("Course 1: " + courseOne);
System.out.println("Course 2: " + courseTwo);
System.out.println("Course 3: " + courseThree);
System.out.println("Course 4: " + courseFour);
}

@Override
public String toString() {
return "[User ID: " + userID + ". Name: " + name + ". Phone: " + phone + ". Email: " + email + ". Balance: "
+ balance + ". State: " + state + ". City: " + city + "]";
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

public void setBalance(double balance) {
this.balance = balance;
};

}