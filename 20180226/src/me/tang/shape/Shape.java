package me.tang.shape;

/**
 * ͼ�γ�����
 * 
 * @author Administrator
 *
 */
public abstract class Shape {
	private Point localtion;// ���ĵ�

	public Shape() {
		super();
	}

	public Shape(Point localtion) {
		super();
		this.localtion = localtion;
	}

	/**
	 * �������
	 * 
	 * @return
	 */
	public abstract void area();

	/**
	 * ����Ƿ����ָ������
	 * 
	 * @return
	 */
	public abstract void contains(Point p);

	public Point getLocaltion() {
		return localtion;
	}

	public void setLocaltion(Point localtion) {
		this.localtion = localtion;
	}

}
