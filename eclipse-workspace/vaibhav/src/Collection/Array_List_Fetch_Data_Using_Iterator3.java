package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Fetch_Data_Using_Iterator3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Singham Bhau");
		al.add(112);
		al.add('B');
		al.add(null);
		//fetch the data using iterator
		           Iterator itr = al.iterator();
		           while(itr.hasNext()) {
		        	   System.out.println(itr.next());
		           }
	}

}
