package ushtrimi3;

import java.util.ArrayList;

public class Client {
	private ArrayList<Reservation> reservations;

	public Client(ArrayList<Reservation> reservations) {
		super();
		this.reservations = reservations;
	}
	
	public Client() {
		this.reservations=null;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	
}
