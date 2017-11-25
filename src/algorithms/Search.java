package algorithms;

public class Search {

	public static int linearSearch(int[] dataSet, int target) {

		// iterate through dataset serach for target
		for (int i = 0; i < dataSet.length; i++) {
			if (dataSet[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] dataSet, int target, int start, int end) {
		
		// binary search assumes a sorted array so can split in half 
	
		System.out.println("Searching between " + start + " and " + end );
		int middle = (int) Math.floor((start+end)/2);		
	System.out.println("Midpoint: " + middle);
		int value = dataSet[middle];
		//System.out.println("Value is " + value);
		
		if (target > value){
			//System.out.println(target + " is > " + value);
			return binarySearch(dataSet, target, middle + 1, end);
		}
		else if (target < value) {
		//	System.out.println(target + " is < " + value);
			return binarySearch(dataSet, target, 0, middle -1);
		}
		return middle;
	}
}