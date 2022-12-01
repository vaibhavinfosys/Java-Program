package Exception_Handling;

public class Arithmetic_Exception_Handling {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
		int c=(a/b);//risky_Code.
		}
		catch(ArithmeticException anky) {
			System.out.println("Idiot enter valid denominator");
		}
		System.out.println("Exception is handled");
	}

}
