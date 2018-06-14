package me.tang.bms.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Integer uid;// ���
	private String name;// ����
	private String idCard;// ֤����
	private List<Integer> rentBooks = new ArrayList<>();// �����鼮
	private Integer status;// ״̬��0��ʾ������1��ﶳ��

	public User() {
		super();
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public List<Integer> getRentBooks() {
		return rentBooks;
	}

	public void setRentBooks(List<Integer> rentBooks) {
		this.rentBooks = rentBooks;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", idCard=" + idCard + ", rentBooks=" + rentBooks + ", status="
				+ status + "]";
	}

}
