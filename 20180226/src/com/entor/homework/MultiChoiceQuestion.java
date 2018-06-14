package com.entor.homework;

/**
 * 多选题
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
	 * 重写父类方法，判断用户多选答案是否正确
	 */
	@Override
	public boolean check(char[] answers) {
		
		// 方式一：
		if (this.answers.length != answers.length)
			return false;
		for (int index = 0; index < answers.length; index++) {
			if (this.answers[index] != answers[index])
				return false;
		}
		
		/*// 方式二：
		String this_answers = new String(this.answers);
		String input_answers = new String(answers);
		if(!this_answers.equals(input_answers))
			return false;*/
		
		return true;
	}
}
