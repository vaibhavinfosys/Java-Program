package Method_Overloading;

public class Method_Overloading1 {
	public static void main(String[] args) {
		multification(10,20);
		multification(10,20,30);
		
		
	}
	public static void multification (int a,int b) {
		System.out.println("Multification  of two number is " + (a*b));
	}
	public static void multification(int a,int b,int c) {
		System.out.println("Multification of three number is " + (a*b*c) );
	}

}
