package Access_Modifier;

public class Private {
	
		 private String fname = "John";
		  private String lname = "Doe";
		  private String email = "john@doe.com";
		  private int age = 24;
		  
		  public static void main(String[] args) {
			  Private myObj = new Private();
			    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
			    System.out.println("Email: " + myObj.email);
			    System.out.println("Age: " + myObj.age);
	}

}
