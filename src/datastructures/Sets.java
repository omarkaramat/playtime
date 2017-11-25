package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {

		Set<String> animals = new LinkedHashSet<String>();
		// LinkedHasSet - ordered entered
		// Hashset - random order
		// TreeSet is alphanumeric (natural) order 
		animals.add("dog");
		animals.add("cat");
		animals.add("mouse");
		animals.add("bird");

		
		// Hash Set is random order 
		System.out.println(animals);
	
		// duplicates are not added
		animals.add("elephant");
		animals.add("bird");
		animals.add("cat");
	
		System.out.println("There are " + animals.size() + " animals " + animals);

		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("bird");
		
		System.out.println("There are " + farmAnimals.size() + " farm animals " + farmAnimals);

		
		// what is the interestion of animals and farm animals
		
		// 1. copy sets into 1
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println("Just show animals added to this HashSet: " + intersectionSet);
		
		// Intersection
		
		// 2 Retain only the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The same animals in both farms are: " + intersectionSet);
		
		// Union 
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("Combine all as a union: " + unionSet);
		
		// DIFFERENCE 
		
		Set <String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("Difference is " + differenceSet);
	
		
		
		
	}

}
