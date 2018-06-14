package me.tang.math;

public class Circle {
	private Point p;
	private int r;

	public Circle(Point p, int r) {
		this.p = p;
		this.r = r;
	}

	/**
	 * ����Բ���
	 * 
	 * @return
	 */
	public double getArea() {
		return Math.PI * r * r;
	}

	/**
	 * ���㵱ǰͼ���Ƿ����Point p ָ���ĵ�
	 * 
	 * @param p
	 * @return
	 */
	public boolean contains(Point p) {
		double rangeX = p.getX() - this.p.getX();// Բ�ĵ����ˮƽ����
		/*
		 * if(rangeX < 0){ rangeX = -rangeX;//��֤����Ϊ�� }
		 */
		double rangeY = p.getY() - this.p.getY();// Բ�ĵ������ֱ����
		/*
		 * if(rangeY < 0){ rangeY = - rangeY;//��֤����Ϊ�� }
		 */
		double range = Math.sqrt(rangeX * rangeX + rangeY * rangeY);
		if (range <= r) {
			return true;
		}
		return false;
	}

	/**
	 * ͼ���Ƿ��������x,y
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean contains(int x, int y) {
		double rangeX = x - this.p.getX();// Բ�ĵ����ˮƽ����
		/*
		 * if(rangeX < 0){ rangeX = -rangeX;//��֤����Ϊ�� }
		 */
		double rangeY = y - this.p.getY();// Բ�ĵ������ֱ����
		/*
		 * if(rangeY < 0){ rangeY = - rangeY;//��֤����Ϊ�� }
		 */
		double range = Math.sqrt(rangeX * rangeX + rangeY * rangeY);
		if (range <= r) {
			return true;
		}
		return false;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public static void main(String[] args) {
		//��ʼ��Բ��
		Point p = new Point(2,2);
		//��ʼ��Բ
		Circle c = new Circle(p,2);
		
		//��������ָ���ĵ�
		Point p2 = new Point(2,5);
		System.out.println("�Ƿ����ָ���ĵ㣺"+c.contains(p2));
		System.out.println("��ȡԲ�����"+c.getArea());
		System.out.println("�Ƿ����ָ�������꣺"+c.contains(2, 4));

	}

}
