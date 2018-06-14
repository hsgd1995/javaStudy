package com.entor.homework;

public class SingleChoiceQuestion extends Question {
	private char answer;// 单选标准答案

	public SingleChoiceQuestion() {
	}

	public SingleChoiceQuestion(String text, String[] options, char answer) {
		super(text, options);
		this.answer = answer;
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	/**
	 * 重写父类的check方法，判断单选题用户答案正确与否
	 */
	@Override
	public boolean check(char[] answers) {
		if (this.answer == answers[0]) {
			return true;
		}
		return false;
	}

}
