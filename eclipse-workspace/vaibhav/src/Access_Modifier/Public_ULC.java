package Access_Modifier;

public class Public_ULC {
	public static void main(String[] args) {
		Public_BLC myObj = new Public_BLC(); 
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	}

}
