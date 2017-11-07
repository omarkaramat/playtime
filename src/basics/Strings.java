package basics;

public class Strings {

	public static void main(String[] args) {
		
		String bookTitle;
		String wordChoice = "Ring";

		bookTitle = "The Lord of the Rings";

		if (bookTitle.contains("Ring")) {
			System.out.println("The book title contains " + wordChoice);
		}

		String browser = "Chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome");
		}

		// if (browser  ==  "chrome") - this is case sensitive		String fname = "Omar";

		String fname = "Omar";
		String sname = "Karamat";
		String niNumber = "3798398303";
		
		System.out.println("There are " + niNumber.length() + " digits in NI number!");

		System.out.print(fname.substring(0,1));
		System.out.print(sname.substring(0,1));
		System.out.println(niNumber.substring(5));


		
		
	}
}
