package datastructures;

import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Implement map interfaces
		TreeMap<Integer,String> hMap = new TreeMap<Integer,String>();
		mapUtil(hMap);
	}

	public static void mapUtil(Map<Integer,String> map) {
		// 1. add key value pairs 
		map.put(101,"Steve");
		map.put(21,"Omar");
		map.put(2,"Sandra");
		map.put(633,"Kade");

		// Expose / access elements 
		
		System.out.println("See all key IDs: " + map.keySet());
		System.out.println("See all key pairs: " + map);
		
		// Iterate through map
		
		System.out.println("Value of ID 101 is: " + map.get(101));
		
		//3 Iterate through the key set
		
		for (int key : map.keySet()) {
			System.out.println("[KEY: " + key + " VALUE: " + map.get(key) + "]");
		}
		
	}
}