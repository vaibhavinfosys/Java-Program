package Access_Modifier;

public class Default {
	 String fname = "John";
	  String lname = "Doe";
	  String email = "john@doe.com";
	  int age = 24;
	  
	  public static void main(String[] args) {
		  Default myObj = new Default();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }

}
