package me.tang.thread;

public class Ticket {
	private static int COUNT = 100;
	
	
	
	public Ticket() {
		super();
	}

	public static int getCOUNT() {
		return COUNT;
	}

	public static void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
	}
	
	
}
