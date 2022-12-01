import java.util.Scanner;

public class Simple_interest {
	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter principle amount");
		int p=sc.nextInt();
		System.out.println("Enter rate of interest");
		int r=sc.nextInt();
		System.out.println("Enter time in year");
		int t=sc.nextInt();
	      
		int si=((p*r*t)/100);
	        System.out.println("Simple interest is "+ si);
	        
		
		
		
	}

}
