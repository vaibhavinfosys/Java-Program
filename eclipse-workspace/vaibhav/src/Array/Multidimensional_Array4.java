package Array;

public class Multidimensional_Array4 {
	public static void main(String[] args) {
		char ar[][]=new char[3][3];
		ar[0][0]='A';
		ar[0][1]='B';
		ar[0][2]='C';
		ar[1][0]='D';
		ar[1][1]='E';
		ar[1][2]='F';
		ar[2][0]='G';
		ar[2][1]='H';
		ar[2][2]='I';
		
		//System.out.println(ar[0][1]);
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.print(ar[i][j] +" ");
		}
		System.out.println();
	}
	
	
	}

}
