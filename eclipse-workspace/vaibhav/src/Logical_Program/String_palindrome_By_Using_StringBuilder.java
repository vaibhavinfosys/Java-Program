package Logical_Program;

public class String_palindrome_By_Using_StringBuilder {
	public static void main(String[] args) {
		    String s1="rotator";
		String rev=(new StringBuilder(s1)).reverse().toString();//The toString() method returns the string representation of the object.
	
		
		if(s1.equals(rev)) {
			System.out.println("Given string is pallindrome  ");
		}
		else {
			System.out.println("Given string is not pallindrome");
		}
		
	}

}
