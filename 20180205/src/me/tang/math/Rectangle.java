package me.tang.math;

public class Rectangle {
	private Point p;
	private int w;
	private int h;

	public Rectangle(Point p, int w, int h) {
		this.p = p;
		this.w = w;
		this.h = h;
	}

	/**
	 * ����Բ���
	 * 
	 * @return
	 */
	public double getArea() {
		return w * h;
	}

	/**
	 * ���㵱ǰͼ���Ƿ����Point p ָ���ĵ�
	 * 
	 * @param p
	 * @return
	 */
	public boolean contains(Point p) {
		// ������߽�
		double leftRange = this.p.getX() - w / 2;
		// �����ұ߽�
		double rightRange = this.p.getY() + w / 2;
		// �����ϱ߽�
		double topRange = this.p.getY() + h / 2;
		//// �����±߽�
		double bottomRange = this.p.getY() - h / 2;

		System.out.println(leftRange + " " + rightRange + "  " + topRange + "  " + bottomRange);
		if (leftRange <= p.getX() && p.getX() <= rightRange && bottomRange <= p.getY() && p.getY() <= topRange) {
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
		// ������߽�
		double leftRange = this.p.getX() - w / 2;
		// �����ұ߽�
		double rightRange = this.p.getY() + w / 2;
		// �����ϱ߽�
		double topRange = this.p.getY() + h / 2;
		//// �����±߽�
		double bottomRange = this.p.getY() - h / 2;
		System.out.println(leftRange + " " + rightRange + "  " + topRange + "  " + bottomRange);
		if(leftRange <= x && x <= rightRange && bottomRange <= y && y <= topRange){
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

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public static void main(String[] args) {
		Point p = new Point(3, 3);
		Rectangle r = new Rectangle(p, 2, 2);
		Point p2 = new Point(2, 5);
		System.out.println("�Ƿ����ָ���ĵ㣺"+r.contains(p2));
		System.out.println("��ȡ���������"+r.getArea());
		System.out.println("�Ƿ����ָ�����꣺"+r.contains(5, 3));
		int a=50;
		String ab = a>=90?"A":60<=a&&a<=80?"B":a<60?"C":"";
		System.out.println(ab);
	}
}
