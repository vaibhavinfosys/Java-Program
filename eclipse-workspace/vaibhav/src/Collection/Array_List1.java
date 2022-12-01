package Collection;

import java.util.ArrayList;

public class Array_List1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Vaibhav");
		al.add(100);
		al.add('A');
		al.add(null);
		//to print entire data
		System.out.println(al);
		//to get the size
		System.out.println(al.size());
		//empty checking
		System.out.println(al.isEmpty());
		//containing data or not
		System.out.println(al.contains(100));
		//to get data from particular index
		System.out.println(al.get(2));
	}

}
