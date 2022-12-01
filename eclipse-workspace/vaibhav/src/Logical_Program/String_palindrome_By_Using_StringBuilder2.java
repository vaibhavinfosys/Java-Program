package Logical_Program;

public class String_palindrome_By_Using_StringBuilder2 {
	public static void main(String[] args) {
		 String s="mom";
		 String rev=(new StringBuilder(s).reverse().toString());
	    if(s.equals(rev)){
	    	System.out.println("Given string is pallindrome");
	    }
	    else {
	    	System.out.println("Given string is not pallindrome");
	    }
	   
		
	}

}
