package Nonstatic_Regular_method_call_from_different_class;
//non-static call from different class
public class Sample1 {//ULC
public static void main(String[] args) {
	Sample2 s=new Sample2();
	s.m5();
	s.m6();
	s.m7();
}
}
