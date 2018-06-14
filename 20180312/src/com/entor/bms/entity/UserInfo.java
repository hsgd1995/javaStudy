package com.entor.bms.entity;

import java.util.LinkedList;
import java.util.List;

/**
 * 用户信息
 */
public class UserInfo {
    private Integer uid;// 编号
    private String name;// 姓名
    private String idCard;// 证件号
    private List<Integer> rentBooks = new LinkedList<>();// 租赁书籍
    private Integer status;// 状态，0表示正常，1表达冻结

    public UserInfo() {
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
        return "UserInfo{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", idCard='" + idCard + '\'' +
                ", rentBooks=" + rentBooks +
                ", status=" + status +
                '}';
    }
}
