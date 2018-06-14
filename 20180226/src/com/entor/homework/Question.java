package com.entor.homework;

public class Question {
	private String text;// 提干
	private String[] options;// 选项

	public Question() {
	}

	public Question(String text, String[] options) {
		super();
		this.text = text;
		this.options = options;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	/**
	 * 检测用户输入的答案是否与标准答案匹配
	 * 
	 * @param answers
	 * @return
	 */
	public boolean check(char[] answers) {
		return false;
	}
}
