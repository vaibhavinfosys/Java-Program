package String_Method;

public class Vaibhav5 {
	public static void main(String[] args) {
		String s1="nagarjun";
		String s2="NAGARJUN";
		String s3="nag";
		System.out.println(s3.length());
		//toUpperCase
		System.out.println(s1.toUpperCase());
		//toLowerCase
		System.out.println(s2.toLowerCase());
		//equal
		System.out.println(s1.equals(s2));
		//equalIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2));
		//contains
		System.out.println(s1.contains("s3"));
		//charAt
		System.out.println(s1.charAt(4));
		//indexOf
		System.out.println(s1.indexOf('u'));
		//startsWith
		System.out.println(s1.startsWith("nag"));
		//endsWith
		System.out.println(s1.endsWith("n"));
		//substring
		System.out.println(s1.substring(5));
		//concat
		System.out.println(s1.concat(" The Hero"));
		//replace
		System.out.println(s1.replace("nagarjun", "Vaibhav"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
