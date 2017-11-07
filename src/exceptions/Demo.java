package exceptions;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program starts");
		doMath(12,0);
		System.out.println("Program continues");		
	}

	public static void doMath(int a, int b) {
		answer(a,b);
	}
	
	public static double answer(int x, int y){
		//catch error here -- exception handling 
		return x/y;
	}
}
