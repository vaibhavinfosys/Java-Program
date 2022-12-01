package Array_Logical_Program;

import java.util.Arrays;

public class To_Print_Array_Element_Using_Array_Class_Method {
	
	public static void main(String[] args) {
		
	String a[]= {"learn","coding","Keypoint","Education"};  // single dimensional Array.
	
	System.out.println("toString()"+ Arrays.toString(a));
	
	System.out.println("asList()"+ Arrays.asList(a));
	
	
	//multiDemenstional Array.
	
	int arr[][]= {{10,20},{30,40}};
	
	System.out.println("deepToString()"+ Arrays.deepToString(arr));
	
	
	
	
	
	
	
	}
}
