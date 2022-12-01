package Logical_Program;

public class Fibonessi_Series {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+" ");
		System.out.print(n2);
		for(int i=2;i<10;i++) {
			sum=(n1+n2);//0+1=1
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
	}

}
