package com.entor.homework;

/**
 * ��ѡ��
 * 
 * @author Administrator
 *
 */
public class MultiChoiceQuestion extends Question {
	private char[] answers;

	public MultiChoiceQuestion() {
	}

	public MultiChoiceQuestion(String text, String[] options, char[] answers) {
		super(text, options);
		this.answers = answers;
	}

	public char[] getAnswers() {
		return answers;
	}

	public void setAnswers(char[] answers) {
		this.answers = answers;
	}

	/**
	 * ��д���෽�����ж��û���ѡ���Ƿ���ȷ
	 */
	@Override
	public boolean check(char[] answers) {
		
		// ��ʽһ��
		if (this.answers.length != answers.length)
			return false;
		for (int index = 0; index < answers.length; index++) {
			if (this.answers[index] != answers[index])
				return false;
		}
		
		/*// ��ʽ����
		String this_answers = new String(this.answers);
		String input_answers = new String(answers);
		if(!this_answers.equals(input_answers))
			return false;*/
		
		return true;
	}
}
