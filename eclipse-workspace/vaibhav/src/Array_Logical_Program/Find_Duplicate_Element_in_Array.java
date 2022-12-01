package Array_Logical_Program;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_Element_in_Array {
	
	public static void main(String[] args) {
		 
		int[] a= {3,5,4,3,2,2,1,5,6,8,9,7,3,5};
		
		Set<Integer> s=new HashSet<Integer>(); 
		
		for(int number:a) {
		if(s.add(number)==false) {
			
			System.out.println(number);
		}
		}
		
	}

}
