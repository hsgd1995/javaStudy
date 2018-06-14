package me.tang.oop;

public class ScoreCalcTest {

	public static void main(String[] args) {
		ScoreCalc sc = new ScoreCalc(75, 80, 85);
		System.out.println(sc.toString());
		sc.showAvg();
		sc.showSum();
	}

}