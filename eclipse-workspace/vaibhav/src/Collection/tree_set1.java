package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class tree_set1 {
	public static void main(String[] args) {//it is exactly like array(the data should be be same)
		TreeSet ts=new TreeSet();
		ts.add("Vaibhav");
		ts.add("Richa");
		ts.add("Shrikant");
		ts.add("RoshNali");
		
// fetch the data using iterator
		 Iterator itr = ts.iterator();	
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
// print the entire data using for each loop
		/* for(Object i:ts) {
			 System.out.println(i);
		 }*/
	}

}
