package me.tang.bms.entity;

public class Book {
	private Integer bid;// �鼮����
	private String bookName;// �鼮����
	private Integer amount;// ����

	public Book() {
		super();
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookName=" + bookName + ", amount=" + amount + "]";
	}

}
