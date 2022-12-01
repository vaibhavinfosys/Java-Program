package Upcasting;

public class Son extends Father{
	public void money() {//already available property in superclass.
		System.out.println("money-150");
	}
	public void mobile() {//newly added property in subclass
		System.out.println("iphone");
	}

}
