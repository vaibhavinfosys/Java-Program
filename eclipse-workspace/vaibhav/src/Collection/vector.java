package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Vaibhav");
		v.add(100);
		v.add('V');
		v.add(null);
		//to check capacity
		//System.out.println(v.capacity());		
		//to print entire data
		//System.out.println(v);
		
		//fetch entire data using Enumerator
		      // Enumeration en = v.elements();
		       //while(en.hasMoreElements()) {
		    	 //System.out.println(en.nextElement());
		    //Using for each loop
		for(Object s:v) {
			System.out.println(s);
	
	
	}
		
		
	}

}
