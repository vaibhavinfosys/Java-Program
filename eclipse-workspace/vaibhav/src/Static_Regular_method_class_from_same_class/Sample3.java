package Static_Regular_method_class_from_same_class;
//static regular method call from same class
public class Sample3 {
	public static void main(String[] args) {
		Hero();
	}
public static void Hero() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
}
