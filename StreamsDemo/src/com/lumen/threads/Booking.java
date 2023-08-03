package com.lumen.threads;

public class Booking {
	public double bookTickets(String name,int noOfTickets){
		double costPerTicket = 200;
		System.out.println("Booked for "+name);
		double totalPrice = costPerTicket*noOfTickets;
		return totalPrice;
	}

}
