package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {

		// TODO 1. Create a collection
		ArrayList<String> cities = new ArrayList();
		
		// TODO 2. Add elements
		cities.add("Bristol");
		cities.add("Hersham");
		cities.add("Kingston-upon-Thames");
		
		for (String city : cities) {
			System.out.println(city);			
		}
		
		System.out.println("There are " + cities.size() + " elements in the collection");
		
		System.out.println("First city is " + cities.get(0));
		
		cities.remove(0);
		int size = cities.size();
		
		System.out.println("There are " + size + " elements in the collection");
		
		System.out.println("First city is " + cities.get(0));
		
		
		
	}

}
