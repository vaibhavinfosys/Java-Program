package Logical_Program;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int number=153;
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
