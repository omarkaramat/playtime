package readCSV;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {

	public static void main(String[] args) {
		// This method will read from a CSV file
		
		List<String[]> data = new ArrayList<String[]>();

		String filename = "C:\\Users\\omar.karamat\\Documents\\eclipse-workspace\\users.csv";
		String datarow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// Read data if not empty 
			
			while ((datarow = br.readLine()) != null) {
				String[] line = datarow.split(",");
				data.add(line);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String[] account : data) {
			System.out.print("[ ");
			for (String field : account) {
				System.out.print(field + " ");		
			}
			System.out.print("]\n");
			
		}
	}
}