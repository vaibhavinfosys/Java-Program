package Booking_Apps;

public class BookTheaterSeat {
	
	int Total_Seat=10;
	
	synchronized void bookSeat(int seat) {
		
		if(Total_Seat>=seat) {
			System.out.println( seat + "Seat book successsfully");
			  Total_Seat=Total_Seat-seat;
			  System.out.println("Seat left :" + Total_Seat);
			  
		}
		
		else {
			System.out.println("Seat cannot be booked....!!!!");
			System.out.println("Seat lest :" + Total_Seat);
		}
		
	}

}
