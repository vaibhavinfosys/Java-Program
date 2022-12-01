import java.util.Scanner;
public class If_Statement {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int number;
	System.out.println("Enter any number");
	number=in.nextInt();
	if(number>0) {
		System.out.println("Number is positive");
	}
	if(number<0) {
		System.out.println("Number is negative");
	}
	if(number==0) {
		System.out.println("Number is zero");
	}
	
}
}
