package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Bidirectional_Cursor_List {
	public static void main(String[] args) {
		
	ArrayList l=new ArrayList();
	
	l.add(100);
	l.add(200);
	l.add(300);
	l.add("Shrikant");
	l.add("Dattatray");
	l.add("vaibhav");
	
	ListIterator litr = l.listIterator();
	
   while(litr.hasNext()) {
	   System.out.println(litr.next());
   }
   
   System.out.println();
   
       while(litr.hasPrevious()) {
    	   System.out.println(litr.previous());
       }
	}

}
