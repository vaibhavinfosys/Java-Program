package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHash_Set {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Vaibhav");
		lhs.add(100);
		lhs.add('M');
		lhs.add(null);
		
// fetch the data using iterator
		/*Iterator itr = lhs.iterator();	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
// print the entire data using for each loop
		for(Object m:lhs) {
			System.out.println(m);
		}
		
		
		
		
	}

}
