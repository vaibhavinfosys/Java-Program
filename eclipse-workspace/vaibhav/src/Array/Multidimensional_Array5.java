package Array;

public class Multidimensional_Array5 {
	public static void main(String[] args) {
		float ar[][]=new float[3][3];
		ar[0][0]=15.1f;
		ar[0][1]=15.2f;
		ar[0][2]=15.3f;
		ar[1][0]=15.4f;
		ar[1][1]=15.5f;
		ar[1][2]=15.6f;
		ar[2][0]=15.7f;
		ar[2][1]=15.8f;
		ar[2][2]=15.9f;
		
		//System.out.println(ar[0][1]);
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.print(ar[i][j] +"   ");
		}
		System.out.println();
		System.out.println();
	}
	
	
	}

}
