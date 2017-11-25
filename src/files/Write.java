package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {

		// 1. Define the path to write 
		String filename ="C:\\Users\\omar.karamat\\Documents\\eclipse-workspace\\udemytraining\\FuuleToCreate.txt";
		String message = "I'm writing data to write to file";
		
	
		// 2. Create the file
	
		File file = new File(filename);
			
		
		// 3 Open the file
		try {
			FileWriter fw = new FileWriter(file);
			
			// 4 write to file
			fw.write(message);
			fw.close();
			
		} catch (IOException e) {
			System.out.println("Error: Could not find file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the: " + filename);
		}
		

		// 5 close the resource
		
	}

}
