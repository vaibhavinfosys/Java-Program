package Exception_Handling;

public class Arithmetic_Exception_Handling2 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
		int c=(a/b);
		}
		catch(ArithmeticException vaibhav) {
			System.out.println("Enter valid denominator");
		}
		System.out.println("hello");
	}

}
