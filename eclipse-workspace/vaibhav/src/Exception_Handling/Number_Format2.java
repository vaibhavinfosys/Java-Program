package Exception_Handling;

public class Number_Format2 {
	public static void main(String[] args) {
	try {
	System.out.println(Integer.parseInt("2k19"));
	}
	catch(NumberFormatException a) {
		System.out.println("do not enter character");
	}
	System.out.println("hi");
}
}
	
