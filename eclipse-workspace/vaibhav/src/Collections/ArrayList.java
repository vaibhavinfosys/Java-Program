package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList {

/*	public static void main(String[] args) {
		java.util.ArrayList<Object> al=new java.util.ArrayList<Object>();
		
		System.out.println("Initial size of ArrayList is : "+ al.size());
		
		// add element to array list
		
		al.add("vaibhav");
		al.add("Sneha");
		al.add("Rajat");
		al.add("Richa");
		al.add("Roshnali");
		al.add(1,"Dam");
	
		
		System.out.println("Size of ArrayList after adding object/element is : "+al.size());
		
		System.out.println("ArrayList element are : "+al);
		
		//Remove element from arrayList
		
		al.remove("Rajat");
		al.remove(1);
		
		//After deleting element of arrayList is
		
		System.out.println(al);
		
		// to get the particular Array list object
		System.out.println(al.get(0));
		
		// to replace the data by using set method 
		System.out.println(al.set(0, "vaibhav mahadev hulwan"));
		
		// to print all data using for each loop
		for(Object o:al) {
			System.out.print(o);
		}
		
		// to fetch data using for loop 
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
		// to fetch data using iterator
		Iterator<Object> itr = al.iterator();
	      while(itr.hasNext()) {
	    	  System.out.println(itr.next());
	      }
	                               */
		
		
		
		
		public static void main(String[] args) {
			
			java.util.ArrayList al=new java.util.ArrayList();
			
			al.add("X");
			al.add("Y");
			al.add("Z");
			al.add("A");
			al.add("B");
			al.add("C");
		
			// add group of element in another arrayList we use addAll method
			java.util.ArrayList<Object> dupli=new java.util.ArrayList<Object> ();
			
			dupli.addAll(al);  
			
			System.out.println(dupli);
			
			
			dupli.removeAll(al);
			
			System.out.println("After removing+" + dupli);
			
			// sorting arrayList we have Collection.sort()
			
			System.out.println("Element in the array list:"+ al);
			
			Collections.sort(al);
			
			System.out.println("Element in the arrayList after sorting :" + al);
			
			
			// to sort in reverse order 
			Collections.sort(al,Collections.reverseOrder());
			
			System.out.println("Element in the arraylist after sorting in reverse order  is :" + al);
			
			
			// shuffling an arrayList
			
			Collections.shuffle(al);
			
			System.out.println("Element in the array list after shuffling  :" + al);
			
			
			
		}

		
		
		
		
		
		
		
		
		

	}


