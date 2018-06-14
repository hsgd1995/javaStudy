package me.tang.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生信息处理类
 * 
 * @author Administrator
 *
 */
public class ListTest {
	/**
	 * 列出学生所有信息
	 * 
	 * @param students
	 */
	public void showStudents(List<Student> students) {
		// 列出学生所有信息
		for (Student s : students) {
			System.out.println("学号：" + s.getId() + "\t 姓名：" + s.getName() + "\t 成绩：" + s.getScore());
		}
	}

	/**
	 * 查询成绩大于80分学生信息
	 * 
	 * @param students
	 */
	public void selectByScore(List<Student> students) {
		for (Student s : students) {
			// 若当前学生的成绩大于80分，则打印该学生信息
			if (s.getScore() > 80) {
				System.out.println("成绩大于80份的学生：" + s.getName());
			}
		}
	}

	/**
	 * 打印最高分学生的信息
	 * 
	 * @param students
	 */
	public void showHighestScoreStudent(List<Student> students) {
		// 创建一个临时学生，用以保存最高分的学生的信息
		Student temp = new Student(0, "", 0);
		for (Student s : students) {
			// 若当前学生的分数高于临时学生的分数，则将当前学生信息赋值给临时学生
			if (s.getScore() > temp.getScore()) {
				temp = s;
			}
		}
		// 打印最高分学生的信息
		System.out.println("最高分的学生信息，学号：" + temp.getId() + "\t 姓名：" + temp.getName() + "\t 成绩：" + temp.getScore());
	}

	/**
	 * 打印平均分
	 * 
	 * @param students
	 */
	public void showAverage(List<Student> students) {
		double sum = 0;// 总分
		for (Student s : students) {
			sum += s.getScore();// 分数汇总
		}
		if (students.size() != 0) {
			// 计算并打印平均分
			System.out.println("平均分为：" + (sum / students.size()));
		}
	}

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "张三", 78));
		students.add(new Student(2, "李四", 80));
		students.add(new Student(3, "王五", 79));
		students.add(new Student(4, "赵六", 82));
		students.add(new Student(5, "周七", 81));
		ListTest listTest = new ListTest();
		listTest.showStudents(students);
		listTest.selectByScore(students);
		listTest.showHighestScoreStudent(students);
		listTest.showAverage(students);
	}

}

/**
 * 学生类
 * 
 * @author Administrator
 *
 */
class Student {
	private int id;// 学号
	private String name;// 姓名
	private double score;// 成绩

	public Student(int id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
