package me.tang.bms.entity;

public class Book {
	private Integer bid;// 书籍编码
	private String bookName;// 书籍名称
	private Integer amount;// 数量

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
