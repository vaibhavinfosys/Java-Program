package Conditional_Statement;
//signal light
public class If_Else_Ladder_Conditional_Statement3 {
	public static void main(String[] args) {
		char signalLight='g';
		if(signalLight=='r') {
			System.out.println("Stop the vehical");
			}
		else if(signalLight=='g') {
			System.out.println("It is safe for moving forward in the traffic");
		}
		else if(signalLight=='y') {
			System.out.println("Slow down the vehical");
		}
		else {
			System.out.println("You can drive your vehical ");
		}
	
	}
}
