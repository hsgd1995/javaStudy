package me.tang.shape;


/**
 * 图形测试类
 * @author Administrator
 *
 */
public class ShapeTest {
	
	public static void test(Shape s,Point p){
		s.contains(p);
		s.area();
		
	}
	
	public static void main(String[] args) {
		//圆类
		//中心点
		Point p1 = new Point(2,2);
		//指定点
		Point p2 = new Point(3,3);
		test(new Circle(p1,2),p2);
		
		//矩形
		//中心点
		Point p3 = new Point(3, 3);
		//指定点
		Point p4 = new Point(2, 5);
		test(new Rectangle(p3,2,2),p4);
	}

}
