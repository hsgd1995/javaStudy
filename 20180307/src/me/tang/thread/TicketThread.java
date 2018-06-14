package me.tang.thread;

public class TicketThread extends Thread {
	private int number;

	public TicketThread() {
		super();
	}

	public TicketThread(String name,  int number) {
		super(name);
		this.number = number;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if((Ticket.getCOUNT()-number)>=0){
			//System.out.println(Ticket.getCOUNT());
			Ticket.setCOUNT(Ticket.getCOUNT()-number);
			System.out.println(Thread.currentThread().getName()+"购买"+number+"张成功，余票："+Ticket.getCOUNT()+"张");
		}else{
			System.out.println("余票："+Ticket.getCOUNT()+"张,"+Thread.currentThread().getName()+"购买"+number+"张失败");
		}
	}

}
