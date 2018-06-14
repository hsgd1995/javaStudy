package me.tang.oop;

public class ScoreCalc {

	private double java;
	private double c;
	private double db;

	public ScoreCalc(double java, double c, double db) {
		this.java = java;
		this.c = c;
		this.db = db;
	}

	public double avg() {

		return (java + c + db) / 3;
	}

	public void showAvg() {
		System.out.println("ƽ���ɼ�Ϊ:" + avg());
	}

	public double sum() {
		return java + c + db;
	}

	public void showSum() {
		System.out.println("�ܳɼ�Ϊ��" + sum());
	}

	@Override
	public String toString() {
		return "������Ϣ [java=" + java + ", c=" + c + ", db=" + db + "]";
	}


}
