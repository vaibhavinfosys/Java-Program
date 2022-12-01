import java.util.Scanner;
public class Simple_Calculator {
	public static void main(String[] args) {
		char operator;
		double num1,num2;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the operator (+,-,*,/)");
		operator=input.next().charAt(0);
		
		System.out.println("Enter the two number one by one");
		num1=input.nextDouble();
	    num2=input.nextDouble();
	    
	    input.close();
	    
	    switch(operator) {
	    case '+':
	    	System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1+num2));
	    break;
	    
	    case '-':
	    	System.out.printf("%.2f - %.2f = %.2f", num1,num2,(num1-num2));
	    break;
	    
	    case '*':
	    	System.out.printf("%.2f * %.2f = %.2f", num1,num2,(num1*num2));
	    break;
	    
	    case '/':
	    	if(num2 !=0) 
	    		System.out.printf("%.2f / %.2f = %.2f", num1,num2,(num1/num2));
	    	    
	    		else
	    			System.out.println("Divide by zero situation");
	    	default:
	    		System.out.printf("%c is an invalid operator", operator);
	    			
	    		
	    	}
	    	
	    	
	    	
	    }
	
	}


