package Method_Overloading;

public class Method_Overloading3 {
	public static void main(String[] args) {
		cuboid(215.52,100.01,81);
		cuboid(102,80.25f);
		
}
	public static void cuboid(double length,double width,double height) {
		System.out.println("Volume of cuboid is " + (length*width*height)+"mm3");
	}
	public static void cuboid(double length,float height) {
		System.out.println("Area of cuboid is " + (length*height));
	}
	
}

