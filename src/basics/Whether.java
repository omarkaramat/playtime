package basics;

public class Whether {
	public static void main(String[] args) {
		
		// This program will give suggestions of what to wear based on the weather (temperature)
		
		int temperature = 61;
		String sunCondition = "Raining";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirts");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's cooler, perhaps where a long sleeve");
			System.out.println("Wear a hat to block sun");
		}
		else if ((temperature > 50) || (sunCondition == "Raining")) {
				System.out.println("Take an umbrella");
				System.out.println("And take a jumper");
		}
		else {
			System.out.println("It's freezing");
		}
	}
}
