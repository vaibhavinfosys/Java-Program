package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Vaibhav");
		ll.add(10);
		ll.add('D');
		ll.add(15.523);
		ll.add(null);
		//fetch the data by using iterator
		    //   Iterator itr = ll.iterator();
		      // while(itr.hasNext()) {
		    	//   System.out.println(itr.next());
		    //   }
		       
		       //fetch the data by using for each loop
		       for(Object r:ll) {
		    	   System.out.println(r);
		       }
		    	   
	}

}
