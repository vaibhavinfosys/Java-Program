package Static_Regular_method_class_from_same_class;
//static regular method call from same class
public class Sample4 {
public static void main(String[] args) {
	vaibhav();
}
public static void vaibhav() {
	int num; // this declares a variable called num
	num = 100; // this assigns num the value 100
	System.out.println("This is num: " + num);
	num = num * 2;
	System.out.print("The value of num * 2 is ");
	System.out.println(num);

}
}
