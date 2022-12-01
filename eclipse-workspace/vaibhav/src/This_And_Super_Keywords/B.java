package This_And_Super_Keywords;

public class B extends A { //BLC
	
	int a=80; // Non static global variable from same class.
	
	public  void test() {
		
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.test();
	}

}
