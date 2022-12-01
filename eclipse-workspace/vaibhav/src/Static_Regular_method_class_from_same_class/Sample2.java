package Static_Regular_method_class_from_same_class;
//static regular method call from same class
public class Sample2 {
	public static void main(String[] args) {
    m1();
    m2();
}
public static void m1() {
	System.out.println("You should be ready for batting");
}
public static void m2() {
	System.out.println("You should be ready for bowling");
}
}