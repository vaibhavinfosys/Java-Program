package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List_Fetch_Data_Using_For_Each_Loop {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Albert Aienstin");
		al.add(12);
		al.add('W');
		al.add(12.12);
	
		
		System.out.println();
		System.out.println(al.size());
		/*   for(Object s:al) {
		    	  System.out.println(s);
		      }
*/
		
		al.add(1, "vaibhav");
		
		al.remove(1);
		
		System.out.println(al);
		
				
}
}
