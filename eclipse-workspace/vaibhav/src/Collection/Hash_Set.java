package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Panch");
		hs.add(12);
		hs.add('H');
		hs.add(null);
		
//fetch the data by using iterator	       
		Iterator itr = hs.iterator();	
	        while(itr.hasNext()) {
	        	System.out.println(itr.next());
	        }
	}

}
