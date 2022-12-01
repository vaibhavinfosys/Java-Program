

public class Star {
	public static void main(String[] niteshSir){
		
		String s1="vaibhav";
		String s2="velocity";
		String s3="INDIA";
		String s4="VELOCITY";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s1.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s4));
		System.out.println(s1.contains("vai"));
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf('h'));
		System.out.println(s1.startsWith("v"));
		System.out.println(s1.endsWith("hav"));
		System.out.println(s1.substring(4));
		System.out.println(s1.concat(s2).concat(s3).concat(s4));
		System.out.println(s4.replace("VELO", "TELO"));
		
	}
}
