package Logical_Program;

public class Reverse_String_Using_For_Loop1 {
	public static void main(String [] args){
		String s1="madam";
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--){
		reverse=reverse+s1.charAt(i);
		}
		System.out.println(reverse);
		if(s1.equals(reverse)) {
			System.out.println("Given string is palidron");
		}
		else {
			System.out.println("Given string is not palidron");
		}
		
		
		
		
		}
	

}
