package me.tang.shape;


/**
 * ͼ�β�����
 * @author Administrator
 *
 */
public class ShapeTest {
	
	public static void test(Shape s,Point p){
		s.contains(p);
		s.area();
		
	}
	
	public static void main(String[] args) {
		//Բ��
		//���ĵ�
		Point p1 = new Point(2,2);
		//ָ����
		Point p2 = new Point(3,3);
		test(new Circle(p1,2),p2);
		
		//����
		//���ĵ�
		Point p3 = new Point(3, 3);
		//ָ����
		Point p4 = new Point(2, 5);
		test(new Rectangle(p3,2,2),p4);
	}

}
