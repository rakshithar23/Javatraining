package com.lumen.threads;

class RunChild implements Runnable{
	
	Booking booking;
	int tickets;
	String counterName;
	
	public RunChild(String counterName, Booking booking, int tickets) {
		super();
		this.counterName = counterName;
		this.booking = booking;
		this.tickets = tickets;
		
		Thread thread = new Thread(this, counterName);
		thread.start();
	}

	@Override
	public void run() {
//		String tname = Thread.currentThread().getName();
//		Booking booking = new Booking();
		System.out.println(counterName);
		synchronized (booking) {
		double amount = booking.bookTickets(counterName, tickets);
		System.out.println(amount);
}
}
}
public class RunThread {
	public static void main(String[] args) {
		Booking booking = new Booking();
		RunChild child1 = new RunChild("Counter-A", booking, 10);
		RunChild child2 = new RunChild("Counter-B", booking, 100);
		RunChild child3 = new RunChild("Counter-C", booking, 120);
		
				
	}


}
