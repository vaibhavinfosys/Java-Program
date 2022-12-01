import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter first number-");
		int a=sc.nextInt();
		System.out.println("Enter second number-");
		int b=sc.nextInt();
		System.out.println("Enter third number-");
		int c=sc.nextInt();
		System.out.println("Enter forth number-");
		int d=sc.nextInt();
		System.out.println("Enter fifth number-");
		int e=sc.nextInt();
		int f=((a+b+c+d+e)/5);
		System.out.println("Avarage of five number = " + f);

	}

}
