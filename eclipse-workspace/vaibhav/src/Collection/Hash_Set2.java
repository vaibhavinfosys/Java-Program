package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set2 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Vaibhav");
		hs.add(100);
		hs.add('H');
		hs.add(null);
	 
//fetch the data by using iterator
		  /*   Iterator itr = hs.iterator();	
		    while(itr.hasNext()) {
		    	System.out.println(itr.next());
		    }*/
		
//print entire data by using for each loop
		for(Object v:hs) {
			System.out.println(v);
		}
	
	
	
	}

}
