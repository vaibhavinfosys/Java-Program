package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class tree_set3 {
	public static void main(String[] args) {//it is exactly like array(the data should be be same)
		TreeSet ts=new TreeSet();
		ts.add(12.10f);
		ts.add(12.20f);
		ts.add(12.30f);
		ts.add(12.40f);
		ts.add(12.50f);
		  
// fetch the data using iterator
		Iterator itr = ts.iterator();	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
