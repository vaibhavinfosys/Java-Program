package String_Method;

public class Vaibhav1 {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s3="velo";
		System.out.println(s1.length());
		//toUpperCase
		System.out.println(s1.toUpperCase());
		//toLowerCase
		System.out.println(s2.toLowerCase());
		//equals
		System.out.println(s1.equals(s2));
		//equalEgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2));
		//contains
		System.out.println(s1.contains(s3));
		//charAT
		System.out.println(s1.charAt(4));
		//indeOf
		System.out.println(s1.indexOf('t'));
		//startsWith
		System.out.println(s1.startsWith("velo"));
		//endsWith
		System.out.println(s1.endsWith("city"));
		//subString
		System.out.println(s1.substring(2));
		//concat()
		System.out.println(s1.concat("vaibhav"));
		//replace
		System.out.println(s1.replace("velo", "felo"));
		
		
		
		
		
		
		
		
		
	}

}
