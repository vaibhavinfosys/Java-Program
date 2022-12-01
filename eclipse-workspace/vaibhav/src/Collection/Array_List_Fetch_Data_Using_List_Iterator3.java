package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List_Fetch_Data_Using_List_Iterator3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Albert Aienstin");
		al.add(12);
		al.add('W');
		al.add(12.12);
		      ListIterator litr = al.listIterator();
		      while(litr.hasNext()) {
		    	  System.out.println(litr.next());
		      }
;
}
}
