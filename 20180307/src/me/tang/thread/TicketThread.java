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
			System.out.println(Thread.currentThread().getName()+"����"+number+"�ųɹ�����Ʊ��"+Ticket.getCOUNT()+"��");
		}else{
			System.out.println("��Ʊ��"+Ticket.getCOUNT()+"��,"+Thread.currentThread().getName()+"����"+number+"��ʧ��");
		}
	}

}
