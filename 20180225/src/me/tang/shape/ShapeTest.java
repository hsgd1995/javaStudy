package me.tang.shape;

/**
 * ͼ�β�����
 * 
 * @author Administrator
 *
 */
public class ShapeTest {

	public static void main(String[] args) {
		// Բ��
		Point p1 = new Point(1, 2);
		// Բ��
		Circle c = new Circle("��ɫ", p1, 2.0);
		System.out.println("Բ�����" + c.calcArea());

		// ���ĵ�
		Point p2 = new Point(3, 4);
		// ����
		Rectangle r = new Rectangle(3, 4, "��ɫ", p2);
		System.out.println("���������" + r.calcArea());
	}

}
