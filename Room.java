package BLC;

public class Room {
	private int roomNo;
	private String roomType;
	private double price;
	private boolean isAvailable;
	public Room(int roomNo, String roomType, double price, boolean isAvailable) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void bookRoom() {
		this.isAvailable=false;
	}
	public int getRoomNumber() {
		return roomNo;
	}
}
