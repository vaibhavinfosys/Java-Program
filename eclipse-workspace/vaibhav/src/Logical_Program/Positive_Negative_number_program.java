package Logical_Program;
import java.util.Scanner;
public class Positive_Negative_number_program {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any number");
			int number=sc.nextInt();
			
			if(number>0) {
				System.out.println("Given number is positive");
			}
			else if(number==0) {
				System.out.println("Given number is constant");
			}
			else {
				System.out.println("Given number is negative");
			}
	    }
	}




