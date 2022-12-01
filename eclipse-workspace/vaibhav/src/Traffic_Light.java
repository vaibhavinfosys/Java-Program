
public class Traffic_Light {
	public static void main(String[] args) {
		String s="green";
		if(s=="red") {
			System.out.println("stop the vehical");
		}
		else if(s=="green") {
			System.out.println("safe for driving");
		}
		else if(s=="yellow") {
			System.out.println("slow down the vehical");
		}
		else {
			System.out.println("Invalid colour");
		}
	}

}
