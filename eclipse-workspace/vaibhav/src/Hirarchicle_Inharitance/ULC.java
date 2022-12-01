package Hirarchicle_Inharitance;

public class ULC {
	public static void main(String[] args) {
		System.out.println("Property of son1 is -");
		Son1 s1=new Son1();
		s1.secBike();
		s1.car();
		s1.money();
		s1.home();
		
		System.out.println("property of son2 is -");
		Son2 s2=new Son2();
		s2.mobile();
		s2.car();
		s2.home();
		s2.money();
	}

}
