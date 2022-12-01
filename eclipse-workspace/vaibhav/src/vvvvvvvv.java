import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class vvvvvvvv {
	public static void main(String[] args) {
	
		ArrayList< Object> al=new ArrayList<Object>();
		
		al.add("vaibhav");
		al.add(20);
		al.add(10.00);
		al.add('A');
		al.add(null);
		al.add("Roshna");
		al.add(null);
		
		for(Object o:al) {
			System.out.print(o);
		}
		System.out.println();
		System.out.println(al.size());
		System.out.println(al.remove(4));
		System.out.println("after removing index number 4 = "+ al.size());
		System.out.println(al.get(0));
		System.out.println(al.set(0, "vaibhav mahadev hulwan"));
		System.out.println(al.get(0));
		
		
		// printing using for loop
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
		// using iterator 
		  
		Iterator<Object> itr = al.iterator();
		      while(itr.hasNext()) {
		    	  System.out.println(itr.next());
		      }
		
		
	}

}
