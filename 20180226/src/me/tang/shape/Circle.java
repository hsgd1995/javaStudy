package me.tang.shape;

/**
 * Բ��
 * 
 * @author Administrator
 *
 */
public class Circle extends Shape {
	private int r;// �뾶
	private static final double PI = 3.14;

	public Circle() {
		super();
	}

	public Circle(Point localtion, int r) {
		super(localtion);
		this.r = r;
	}

	/**
	 * �������
	 */
	@Override
	public void area() {
		System.out.println("Բ�����Ϊ��" + PI * r * r);
	}

	/**
	 * ����Ƿ����ָ������
	 */
	@Override
	public void contains(Point p) {
		double rangeX = p.getX() - getLocaltion().getX();// Բ�ĵ����ˮƽ����
		double rangeY = p.getY() - getLocaltion().getY();// Բ�ĵ������ֱ����
		double range = Math.sqrt(rangeX * rangeX + rangeY * rangeY);
		if (range <= r) {
			System.out.println("��Բ����ָ���ĵ㣡");
		} else {
			System.err.println("��Բ������ָ���ĵ㣡");
		}
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

}
