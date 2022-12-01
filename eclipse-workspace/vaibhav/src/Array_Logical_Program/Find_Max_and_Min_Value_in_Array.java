package Array_Logical_Program;

public class Find_Max_and_Min_Value_in_Array {
	public static void main(String[] args) {
	
	int[] a= {1,3,5,2,4,6,50};
	
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}
	System.out.println(max);
	
	
	
	}	

}
