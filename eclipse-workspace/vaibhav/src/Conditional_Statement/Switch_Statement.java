package Conditional_Statement;

public class Switch_Statement {
	public static void main(String[] args) {
		int day=5;
		switch(day) {
		case 1:{
			System.out.println("Monday");
			break;
		}
		case 2:{
			System.out.println("Tuesday");
			break;
		}
		case 3:{
			System.out.println("Wensday");
			break;
		}
		case 4:{
			System.out.println("thursday");
			break;
		}
		case 5:{
			System.out.println("friaday");
			break;
		
		}
		case 6:{
			System.out.println("saturday");
			break;
		}
		default:{
			System.out.println("No case matched");
		}
		}
	}
}
