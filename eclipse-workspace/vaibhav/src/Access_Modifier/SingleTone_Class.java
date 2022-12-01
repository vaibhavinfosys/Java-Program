package Access_Modifier;

public class SingleTone_Class {
	
	private SingleTone_Class(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		SingleTone_Class sc=new SingleTone_Class(10,20);
		
	}
		
	

}
