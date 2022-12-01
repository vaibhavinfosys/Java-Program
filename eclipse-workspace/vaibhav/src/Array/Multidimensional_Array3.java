package Array;

public class Multidimensional_Array3 {
	public static void main(String[] args) {
		String ar[][]=new String[3][3];
		ar[0][0]="*";
		ar[0][1]="*";
		ar[0][2]="*";
		ar[1][0]="*";
		ar[1][1]="*";
		ar[1][2]="*";
		ar[2][0]="*";
		ar[2][1]="*";
		ar[2][2]="*";
		
		//System.out.println(ar[0][1]);
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.print(ar[i][j] +" ");
		}
		System.out.println();
	}
	
	
	}

}
