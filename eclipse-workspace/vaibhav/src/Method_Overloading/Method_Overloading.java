package Method_Overloading;

public class Method_Overloading {
	public static void main(String[] args) {
		addition(10,20);
		addition(10,20,30);
		addition(10,20,30,40);
	}
	public static void addition(int a,int b) {
		System.out.println(" Addition of two number is " + (a+b));
	}
	public static void addition(int a,int b,int c) {
		System.out.println(" Addition of three number is " + (a+b+c));
	}
	public static void addition(int a,int b,int c,int d) {
		System.out.println(" Addition of three number is " + (a+b+c+d));
	}
	

}

