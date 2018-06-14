package me.tang.shape;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class Rectangle extends Shape {
	private int h;// ��
	private int w;// ��

	public Rectangle() {
		super();
	}

	public Rectangle(Point localtion, int h, int w) {
		super(localtion);
		this.h = h;
		this.w = w;
	}

	/**
	 * �������
	 */
	@Override
	public void area() {
		System.out.println("�������Ϊ��" + h * w);
	}

	/**
	 * ����Ƿ����ָ������
	 */
	@Override
	public void contains(Point p) {
		// ������߽�
		double leftRange = getLocaltion().getX() - w / 2;
		// �����ұ߽�
		double rightRange = getLocaltion().getY() + w / 2;
		// �����ϱ߽�
		double topRange = getLocaltion().getY() + h / 2;
		//// �����±߽�
		double bottomRange = getLocaltion().getY() - h / 2;

		if (leftRange <= p.getX() && p.getX() <= rightRange && bottomRange <= p.getY() && p.getY() <= topRange) {
			System.out.println("�þ��ΰ���ָ���ĵ㣡");
		} else {
			System.err.println("�þ��β�����ָ���ĵ㣡");
		}
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

}
