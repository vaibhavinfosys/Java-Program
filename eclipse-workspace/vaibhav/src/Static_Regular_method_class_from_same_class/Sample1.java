package Static_Regular_method_class_from_same_class;
//static regular method call from same class
public class Sample1 {
public static void main(String[] args) {
	m1();//Method calling statement
	m2();//Method calling statement
	m3();//Method calling statement
}
	

	public static void m1() {
		System.out.println("I am running from m1 method");
	}	
		public static void m2() {
		System.out.println("I am running from m2 method");
	}
		public static void m3() {
		System.out.println("I am running from m3 method");
		
	}
}
