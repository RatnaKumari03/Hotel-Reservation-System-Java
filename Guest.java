package BLC;

public class Guest {
	private int guestId;
	private String guestName;
	private String email;
	public Guest(int guestId, String guestName, String email) {
		this.guestId = guestId;
		this.guestName = guestName;
		this.email = email;
	}
	public String getName() {
		return guestName;
	}
}
