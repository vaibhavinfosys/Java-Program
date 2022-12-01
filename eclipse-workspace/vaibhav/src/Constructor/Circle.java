package Constructor;

public class Circle {
	
		double area;
		Circle(double pie,double radius1,double radius2){
		area=(pie*radius1*radius2);
		System.out.println("Area of circle is " + area +"sqmm");
		}
	
	
   public static void main(String[] args) {
	   Circle c=new Circle(3.14,55.2,55.2);
	   
   }

   }

