package me.tang.exam;

/**
 * 单选题
 * 
 * @author Administrator
 * 
 */
public class SingleChoice extends Question {
	private String[] options;
	private char answer;

	public SingleChoice(String text, String[] options, char answer) {
		super(text);
		this.answer = answer;
		this.options = options;
	}

	/**
	 * 检验标准答案
	 */
	@Override
	public boolean check(char[] answers) {
		//如果数组长度不等于1，返回false
		if(answers.length!=1){
			return false;
		}
		//判断输入的答案与正确答案是否相等
		if(answer == answers[0]){
			return true;
		}
		return false;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

}
