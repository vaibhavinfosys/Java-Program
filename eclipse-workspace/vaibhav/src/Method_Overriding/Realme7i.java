package Method_Overriding;

public class Realme7i extends Realme7 {
	public void camera() {
		System.out.println("Rear camera is 64MP");
	}
	
	
	public static void main(String [] args) {
		
		Realme7i richa=new Realme7i();
		
		richa.camera();
	}

}
