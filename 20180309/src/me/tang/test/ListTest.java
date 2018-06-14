package me.tang.test;

import java.util.ArrayList;
import java.util.List;

/**
 * ѧ����Ϣ������
 * 
 * @author Administrator
 *
 */
public class ListTest {
	/**
	 * �г�ѧ��������Ϣ
	 * 
	 * @param students
	 */
	public void showStudents(List<Student> students) {
		// �г�ѧ��������Ϣ
		for (Student s : students) {
			System.out.println("ѧ�ţ�" + s.getId() + "\t ������" + s.getName() + "\t �ɼ���" + s.getScore());
		}
	}

	/**
	 * ��ѯ�ɼ�����80��ѧ����Ϣ
	 * 
	 * @param students
	 */
	public void selectByScore(List<Student> students) {
		for (Student s : students) {
			// ����ǰѧ���ĳɼ�����80�֣����ӡ��ѧ����Ϣ
			if (s.getScore() > 80) {
				System.out.println("�ɼ�����80�ݵ�ѧ����" + s.getName());
			}
		}
	}

	/**
	 * ��ӡ��߷�ѧ������Ϣ
	 * 
	 * @param students
	 */
	public void showHighestScoreStudent(List<Student> students) {
		// ����һ����ʱѧ�������Ա�����߷ֵ�ѧ������Ϣ
		Student temp = new Student(0, "", 0);
		for (Student s : students) {
			// ����ǰѧ���ķ���������ʱѧ���ķ������򽫵�ǰѧ����Ϣ��ֵ����ʱѧ��
			if (s.getScore() > temp.getScore()) {
				temp = s;
			}
		}
		// ��ӡ��߷�ѧ������Ϣ
		System.out.println("��߷ֵ�ѧ����Ϣ��ѧ�ţ�" + temp.getId() + "\t ������" + temp.getName() + "\t �ɼ���" + temp.getScore());
	}

	/**
	 * ��ӡƽ����
	 * 
	 * @param students
	 */
	public void showAverage(List<Student> students) {
		double sum = 0;// �ܷ�
		for (Student s : students) {
			sum += s.getScore();// ��������
		}
		if (students.size() != 0) {
			// ���㲢��ӡƽ����
			System.out.println("ƽ����Ϊ��" + (sum / students.size()));
		}
	}

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "����", 78));
		students.add(new Student(2, "����", 80));
		students.add(new Student(3, "����", 79));
		students.add(new Student(4, "����", 82));
		students.add(new Student(5, "����", 81));
		ListTest listTest = new ListTest();
		listTest.showStudents(students);
		listTest.selectByScore(students);
		listTest.showHighestScoreStudent(students);
		listTest.showAverage(students);
	}

}

/**
 * ѧ����
 * 
 * @author Administrator
 *
 */
class Student {
	private int id;// ѧ��
	private String name;// ����
	private double score;// �ɼ�

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
