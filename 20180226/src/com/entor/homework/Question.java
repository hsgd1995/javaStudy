package com.entor.homework;

public class Question {
	private String text;// ���
	private String[] options;// ѡ��

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
	 * ����û�����Ĵ��Ƿ����׼��ƥ��
	 * 
	 * @param answers
	 * @return
	 */
	public boolean check(char[] answers) {
		return false;
	}
}
