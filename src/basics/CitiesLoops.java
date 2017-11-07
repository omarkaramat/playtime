package basics;

public class CitiesLoops {

	public static void main(String[] args) {

		//Declare an array
		String[] places = new String[3];
		places[0] = "Bishopston";
		places[1] = "Walton-on-Thames";
		places[2] = "Hersham";	
		int i = 0;
		
		// do loop - enters the loop THEN tests condition
		
		do {
		System.out.println(places[i]);
		i = i + 1;
		} while (i < 3);
		
		// while loop - tests condition first then enters loop
				
		int n = 0;
		while (n < 3) {
			System.out.println(places[n]);			
			n++;
		}	

		int x = 0;
		boolean stateFound = false;
		
		System.out.println(stateFound);			
		
		while (!stateFound && x < 3) {
			System.out.println(stateFound);			
			
			String state = places[x];
			System.out.println(state);			
			
			if (state == "Hershalm") {
			System.out.println("STATE FOUND!" + state);			
			stateFound = true;
			}
			x++;
		}	
		
		System.out.println("******************* PRINTING WITH FOR LOOP\n");				
		for (int y = 0; y < 3; y++) {
			System.out.println(places[y]);
		}
		
	
	}
}
