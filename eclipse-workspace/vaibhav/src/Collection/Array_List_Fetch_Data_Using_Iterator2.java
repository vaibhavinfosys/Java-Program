package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Fetch_Data_Using_Iterator2 {
	public static void main(String[] args) {
     ArrayList vaibhav=new ArrayList();
     vaibhav.add("Happy Birthday Bhau");
     vaibhav.add('k');
     vaibhav.add(50);
     vaibhav.add(15.0212);
     //fetch the data using iterator
             Iterator itr = vaibhav.iterator();
             while(itr.hasNext()) {
            	 System.out.println(itr.next());
             }
	}
}