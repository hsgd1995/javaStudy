package me.tang.exam;

/**
 * ������
 * 
 * @author Administrator
 * 
 */
public class Question {
	private String text;// ���

	public Question() {
		super();
	}

	public Question(String text) {
		super();
		this.text = text;
	}

	/**
	 * �����׼��
	 * 
	 * @param answers
	 * @return
	 */
	public boolean check(char[] answers) {

		return false;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
