package Array_Logical_Program;

public class Find_Min_Value_in_Array {
	public static void main(String[] args) {
		
		int[] a= {5,8,15,35,70,1,2,42};
		 
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
		
			if(min>a[i]) {
				min=a[i];
			}
		}
		
		System.out.println(min);
}

}
