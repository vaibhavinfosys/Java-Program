package Array_Logical_Program;

public class Copy_All_Element_Of_one_Array_To_Another_Array {
	
	public static void main(String[] args) {
	
		int a[]= {10,20,30,40,50};
		
		int b[]=new int[5];
		
		System.out.println("First Array Element:");
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
      System.out.println("Second Array Element:");
      
      for(int i=0;i<5;i++) {
    	  b[i]=a[i];
    	  
    	  System.out.println(b[i]);
      }
		
		
		
		
		
		
		
		
	}
}
