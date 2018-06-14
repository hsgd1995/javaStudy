package me.tang.exam;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ��ѡ��
 * 
 * @author Administrator
 * 
 */
public class MultiChoice extends Question {
	private String[] options;
	private char[] answers;

	public MultiChoice(String text, String[] options, char[] answers) {
		super(text);
		this.options = options;
		this.answers = answers;
	}

	/**
	 * �����׼��
	 */
	@Override
	public boolean check(char[] answers) {
		Arrays.sort(answers);
		Arrays.sort(this.answers);
		//�������Ϊ�գ����߳���С��0�����߳��Ȳ�������ȷ�����鳤�ȣ���return false
		if (answers == null || answers.length <= 0
				|| answers.length != this.answers.length) {
			return false;
		}
		//�Ƚ����������ֵ�Ƿ����
		return Arrays.equals(answers, this.answers);
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public char[] getAnswers() {
		return answers;
	}

	public void setAnswers(char[] answers) {
		this.answers = answers;
	}

}
