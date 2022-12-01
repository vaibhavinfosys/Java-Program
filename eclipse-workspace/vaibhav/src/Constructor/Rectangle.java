package Constructor;
//Parameterized constructor
public class Rectangle {
	int area;
	//constructor
	//notice here there is no return type and name is same as class name
	Rectangle(int length,int height){
		area=height*length;
		System.out.println("Area of rectangle=" + area);
	}
	public static void main(String[] args) {
		//Creating object of class
		/*notice here there are two value is passed because there are two parameter in constructor 10 will assign to height
		  and 25 will assign to width*/
		 
		Rectangle vaibhav = new Rectangle(100,60);
	}
		
		
		
	}


