package Star_Pattern;

public class Tilted_Traingle_Right {
	public static void main(String[] args){
		for(int i=1;i<=8;i++){
		for(int j=7;j>=i;j--){
		System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
		System.out.print("*");
		}
		System.out.println();
		}
		}


}
