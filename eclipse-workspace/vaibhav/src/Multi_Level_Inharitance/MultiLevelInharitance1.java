package Multi_Level_Inharitance;

public class MultiLevelInharitance1 {
	public static void main(String[] args) {
		System.out.println("whatsapp can done following");
	/*Whatsapp_Version4 s=new Whatsapp_Version4();       //Either you print directly by creating object of subclass or by
	s.payment();                                         //creating the object of particular class as shown in following.
	s.video();
	s.audio();
	s.chat();*/
	Whatsapp_Version1 w1=new Whatsapp_Version1();
	w1.chat();
	Whatsapp_Version2 w2=new Whatsapp_Version2();
	w2.audio();
	Whatsapp_Version3 w3=new Whatsapp_Version3();
	w3.video();
	Whatsapp_Version4 w4=new Whatsapp_Version4();
	w4.payment();
	
	}

}
