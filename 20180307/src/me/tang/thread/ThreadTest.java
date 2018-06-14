package me.tang.thread;

public class ThreadTest {

	public static void main(String[] args) {
		TicketThread t1 = new TicketThread("´°¿Ú1", 55);
		
		t1.start();
		TicketThread t2 = new TicketThread("´°¿Ú2", 35);
		t2.start();
		TicketThread t3 = new TicketThread("´°¿Ú3", 25);
		t3.start();
	}

}
