package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_Array_Into_ArrayList {
	public static void main(String[] args) {
		
		String arr[]= {"Dog" ,"Cat","Elephant"};
		
		for(String value:arr) {
			System.out.println(value);
			
		}
		
		ArrayList al=new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);
		
		
		
		
		
	}

}
