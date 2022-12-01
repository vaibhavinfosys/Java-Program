package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set2 {
public static void main(String[] args) {//it is exactly like array(the data should be be same)
	TreeSet ts=new TreeSet();
	ts.add(10);
	ts.add(20);
	ts.add(25);
	ts.add(30);
	
// fetch the data using iterator
	      /*  Iterator itr = ts.iterator();	
	        while(itr.hasNext()) {
	        	System.out.println(itr.next());
	        }*/
// print the entire data using for each loop
	        for(Object s:ts) {
	        	System.out.println(s);
	        }
	
}
}
