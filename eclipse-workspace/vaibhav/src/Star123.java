
public class Star123 {
	public static void main(String[] args) {
		int x=1;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=x;j--) {
				System.out.print("*");
			}
			System.out.println();
			x++;
		}
		int z=5;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=z;j--) {
				System.out.print("*");
			}
			System.out.println();
			z--;
		}
	}

}
