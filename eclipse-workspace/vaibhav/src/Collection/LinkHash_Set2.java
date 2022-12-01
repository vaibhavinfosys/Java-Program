package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHash_Set2 {
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	     lhs.add("Vaibhav");
	     lhs.add('A');
	     lhs.add(100);
	     lhs.add(null);
	     
//fetch the data by using iterator
	     Iterator itr = lhs.iterator();	 
	      while(itr.hasNext()) {
	    	  System.out.println(itr.next());
	      }
}
}
	