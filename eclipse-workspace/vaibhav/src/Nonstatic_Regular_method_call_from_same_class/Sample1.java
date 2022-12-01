package Nonstatic_Regular_method_call_from_same_class;
//non-static call from same class
public class Sample1 {
public static void main(String[] args) {
	Sample1 s=new Sample1();
	s.m4();//method calling statemnt
	s.m3();//method calling statement
	
	
}
public void m3() {
	System.out.println("running from same class and m3");
}
public void m4() {
	System.out.println("running from same class m4");
}
}
