package Logical_Program;

public class Reverse_String_Using_For_Loop {
	public static void main(String[] args) {
		String s1="Vaibhav";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			
			
		}
		System.out.println(rev);
		
	}

}
