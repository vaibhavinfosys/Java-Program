package Booking_Apps;

public class MovieBookApps extends Thread {
	 public static  BookTheaterSeat b;
	 int seats;
	public void run() {
		
		b.bookSeat(seats);
		
		
	}
	
	public static void main(String[] args) {
		
		b=new BookTheaterSeat();
				
		
		MovieBookApps vaibhav=new MovieBookApps();
		vaibhav.seats=7;
		vaibhav.start();
		
		MovieBookApps deepak=new MovieBookApps();
		deepak.seats=6;
		deepak.start();
		
	}
	

}
