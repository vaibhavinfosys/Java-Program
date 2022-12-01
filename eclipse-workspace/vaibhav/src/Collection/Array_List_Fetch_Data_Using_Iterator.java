package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Fetch_Data_Using_Iterator {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Vaibhav");
		al.add(100);
		al.add('A');
		al.add(null);
		//fetch the data using iterator
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
