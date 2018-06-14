package me.tang.exam;

/**
 * ��ѡ��
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
	 * �����׼��
	 */
	@Override
	public boolean check(char[] answers) {
		//������鳤�Ȳ�����1������false
		if(answers.length!=1){
			return false;
		}
		//�ж�����Ĵ�����ȷ���Ƿ����
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
