package Conditional_Statement;
//income tax
public class If_Else_Ladder_Conditional_Statement4 {
	public static void main(String[] args) {
		long incomePerYear;
		
         incomePerYear=8000000;
		
         
         if(incomePerYear>=1000000) {
			System.out.println("Tax=5% on your income");
		}
		else if(incomePerYear>=500000) {
			System.out.println("Tax=2% on your income");
		}
		else if(incomePerYear>=100000) {
			System.out.println("Tax=0.5% on your income");
		}
		else {
			System.out.println("No tax on your income");
		}
	
	}
}
