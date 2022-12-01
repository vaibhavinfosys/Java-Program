package Loops;

public class Nested_For_Loop_Star8 {
	public static void main(String[] args) {
		int x=5;
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=x;j++) {
				System.out.print("*");
			}
			System.out.println();
			x--;
		}
	}

}
