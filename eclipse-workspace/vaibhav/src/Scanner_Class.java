import java.util.Scanner;

public class Scanner_Class {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter Number");
int number=sc.nextInt();
int count=0;
for(int i=1;i<=number;i++) {
	if(number%i==0)
	count++;
}
if(count==2) {
	System.out.println("It is prime number");
}
else {
	System.out.println("It is not prime number");
}


}
}
