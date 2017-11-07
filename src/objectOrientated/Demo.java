package objectOrientated;

class Person {
	
	// class is the blueprint 
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");		
	}

	void eat() {
		System.out.println(email);	
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}

}

public class Demo {

	public static void main(String[] args) {

	// Instantiate an object 
	Person person1 = new Person();
	Person person2 = new Person();

	// Define properties
	person1.name = "Joe";
	person1.email = "Joe@monkey.com";
	person1.phone = "78233333332";
	
	//Abstraction 
	person1.walk();
	person1.sleep();
	person1.eat();

	person2.name = "Sarah";
	person2.email = "sarah@monkey.com";
	person2.phone = "7232223332";
	
	//Abstraction 
	person2.walk();

	
	/**
		// Person
	
		String name = "Omar";
		String email = "omar.karamat@gmail.com";
		String phone = "7985558966";
		
	
		// Attributes , Adjectives 
		
		// Action, activity, behaviour 
		System.out.println(name + " is running 10 KM");
		System.out.println(name + " is learning Java");
		walking(name);
	
		**/
		

		
	}

	// enhance by using functions
	
	static void walking(String name) {
		System.out.println(name + " is walking");
	}
	
	
	
}
