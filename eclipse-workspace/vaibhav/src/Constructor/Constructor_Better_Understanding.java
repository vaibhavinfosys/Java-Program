package Constructor;

public class Constructor_Better_Understanding {
	
	
	
	
	public Constructor_Better_Understanding() {
		System.out.println("I am Zero parameterized consructor");
	}
	
	public Constructor_Better_Understanding (int a) {
		System.out.println("I am parameterized constructor");
	}
	
	public Constructor_Better_Understanding (String b) {
		System.out.println("I am also parameterized constructor");
	}
	
	public static void main(String[] args) {
		 
		Constructor_Better_Understanding ganpati=new Constructor_Better_Understanding ();
		
		Constructor_Better_Understanding shankar=new Constructor_Better_Understanding (10);
		
		Constructor_Better_Understanding mahadev=new Constructor_Better_Understanding ("biroba");
	}

}
