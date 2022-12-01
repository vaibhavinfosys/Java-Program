package Star_Pattern;

public class Pyramid {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==5||i==1&&j==6||i==1&&j==7||i==2&&j==1||i==2&&j==2||i==2&&j==6||i==2&&j==7||i==3&&j==1||i==3&&j==7){
					 System.out.print("  ");
				
				}
				else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}