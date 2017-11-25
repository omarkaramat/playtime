package datastructures;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] alphabetic = {"a", "b", "c", "d"};
		
		/**
		for (int i=0; i<5; i++) {
			System.out.print(alphabetic[i]);
		}
		**/
		
		/**
		for (
				int n=0; n<alphabetic.length; n++) { 
					System.out.print(alphabetic[n]);
					}
		**/
		
		System.out.print("\n\nUsing the For-Each method\n");
		
		for (String letter : alphabetic) {
			System.out.println(letter);
		}
		
		String[][] users = { 	
								{"Omar","Karamat","omar.karamat@gmail.com","090909099"}, 
								{"John","Doe","JDoe@justin.com","090909099"}, 
								{"Amber","Romero","a.romero@gmail.com","090909099"}
							};

		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("\nDouble arrays:");		
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		// Traverse the double array
		
		for (int i=0;i<numOfUsers;i++){
			
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			
			System.out.println(firstName + ", " + lastName + ", " + email + ", " + phone);

			}
		
		System.out.println("\n\nUsing for each:");
		
		for (String[] user : users) {
		System.out.print("[ ");	
			for (String field : user) {
				
				System.out.print(field + " ");
			}
			System.out.println(" ]");	
		}
				
		}		
	}	
