package com.entor.homework;

public class SingleChoiceQuestion extends Question {
	private char answer;// ��ѡ��׼��

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
	 * ��д�����check�������жϵ�ѡ���û�����ȷ���
	 */
	@Override
	public boolean check(char[] answers) {
		if (this.answer == answers[0]) {
			return true;
		}
		return false;
	}

}
