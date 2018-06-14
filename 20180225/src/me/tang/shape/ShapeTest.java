package me.tang.shape;

/**
 * 图形测试类
 * 
 * @author Administrator
 *
 */
public class ShapeTest {

	public static void main(String[] args) {
		// 圆心
		Point p1 = new Point(1, 2);
		// 圆类
		Circle c = new Circle("红色", p1, 2.0);
		System.out.println("圆面积：" + c.calcArea());

		// 中心点
		Point p2 = new Point(3, 4);
		// 矩形
		Rectangle r = new Rectangle(3, 4, "黑色", p2);
		System.out.println("矩形面积：" + r.calcArea());
	}

}
