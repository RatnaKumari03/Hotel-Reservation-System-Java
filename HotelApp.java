package ELC;

import java.util.Scanner;

import BLC.Booking;
import BLC.Guest;
import BLC.Room;
import ExceptionHotel.RoomNotAvailableException;

public class HotelApp {

	public static void main(String[] args) {
		System.out.println("------------Welcome to Smart Hotel Reservation System------------");
		try {
			Room r1=new Room(1001, "Deluxe", 2500, true);
			Guest g1=new Guest(1, "Ratna", "ratna@gmail.com");
			System.out.println("Hello " + g1.getName() + ", checking room availability...");
			Booking b1=new Booking(1001, g1, r1, "25-Dec-2025", "27-Dec-2025");
			
			System.out.println("Booking confirmed!");
            System.out.println("Room No: " + r1.getRoomNumber());
            System.out.println("Enjoy your stay....");
            
            System.out.println("\nTrying to book the same room again...");
            Booking b2=new Booking(1002, g1, r1, "28-Dec-2025", "30-Dec-2025");
            //System.out.println("\nTrying to book the same room again...");
            
		} catch (RoomNotAvailableException e) {
			// TODO: handle exception
			//System.out.println("Rooms not Available!!!");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("\n Checkout completed.");
            System.out.println(" Thank you for staying with us...");
            System.out.println(" Safe Travels!! Visit Again....");
		}
	}

}
