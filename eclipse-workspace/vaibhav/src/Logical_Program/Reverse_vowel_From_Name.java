package Logical_Program;

public class Reverse_vowel_From_Name {
	public static void main(String [] args){

		String s1=new String("vaibhav");
		
		
		
		for(int i=s1.length()-1;i>=0;i--) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
			   System.out.print(s1.charAt(i));
		}
		
		
}

}
}
