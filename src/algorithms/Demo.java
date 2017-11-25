package algorithms;

public class Demo {

	public static void main(String[] args) {

		int[] numbers = { 211, 10, 201, 29, 443, 21 };
		int[] sortedNumbers = { 4, 12, 21, 22, 44, 344, 5554, 5555, 99043, 10022020 };

		// call a function that searches for a specific number
		int pos = algorithms.Search.linearSearch(numbers, 443);

		System.out.println("Found at position " + pos);

		int index = algorithms.Search.binarySearch(sortedNumbers, 21, 0, sortedNumbers.length);

		System.out.println("Found at position " + index);

		Sort.bubbleSort(numbers);
	}

}
