package me.tang.exam;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 多选题
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
	 * 检验标准答案
	 */
	@Override
	public boolean check(char[] answers) {
		Arrays.sort(answers);
		Arrays.sort(this.answers);
		//如果数组为空，或者长度小于0，或者长度不等于正确答案数组长度，则return false
		if (answers == null || answers.length <= 0
				|| answers.length != this.answers.length) {
			return false;
		}
		//比较两个数组的值是否想等
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
