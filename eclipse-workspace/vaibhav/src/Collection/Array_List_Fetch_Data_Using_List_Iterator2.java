package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List_Fetch_Data_Using_List_Iterator2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Bhai");
		al.add(25);
		al.add('G');
		al.add(12.1205);
		    ListIterator litr = al.listIterator();	
		    while(litr.hasNext()) {
		    	System.out.println(litr.next());
		    }

}
}
