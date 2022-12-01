package Logical_Program;

import java.util.Scanner;

public class Logical_Program_using_ScannerClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=s.nextInt();
		int actualNumber=number;
		int armStrongNumber=0;
		int remainder=0;
		while(number>0) {
			remainder=(number%10);
			armStrongNumber=((remainder*remainder*remainder)+armStrongNumber);
			number=number/10;
		}
		if(actualNumber==armStrongNumber) {
			System.out.println("Given number is Armstrong number");
		}
		else {
			System.out.println("Given number is not Armstrong");
		}
	}

}
