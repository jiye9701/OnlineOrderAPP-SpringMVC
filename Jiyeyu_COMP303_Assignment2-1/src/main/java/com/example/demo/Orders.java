package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Orders")
public class Orders {
	
	@Id
	@Column(name = "orderNo")
	public int orderNo;
	
	@Column(name = "userNo")
	public int userNo;
	
	@Column(name = "laptopId")
	public int laptopId;
	
	@Column(name = "lsize")
	public String lsize;
	
	@Column(name = "lnum")
	public int lnum;
	
	@Column(name = "amountpaid")
	public double amountPaid;

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLsize() {
		return lsize;
	}

	public void setLsize(String lsize) {
		this.lsize = lsize;
	}

	public int getLnum() {
		return lnum;
	}

	public void setLnum(int lnum) {
		this.lnum = lnum;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	
	//
	
	
	public Orders() {}
	
	public Orders(int orderNo, int laptopId, String lsize ,int lnum, double amountPaid) {
		super();
		this.orderNo = orderNo;
		this.laptopId = laptopId;
		this.lsize = lsize;
		this.lnum = lnum;
		this.amountPaid = amountPaid;
	}
	
	public Orders(int userNo, int laptopId, int lnum, double amountPaid, String lsize) {
		super();
		this.userNo = userNo;
		this.laptopId = laptopId;
		this.lsize = lsize;
		this.lnum = lnum;
		this.amountPaid = amountPaid;
	}
	
	public Orders(int orderNo, int userNo, int laptopId, int lnum, double amountPaid) {
		super();
		this.orderNo = orderNo;
		this.userNo = userNo;
		this.laptopId = laptopId;
		this.lnum = lnum;
		this.amountPaid = amountPaid;
	}
	
	public Orders(int lnum, double amountPaid) {
		super();
		this.lnum = lnum;
		this.amountPaid = amountPaid;
		
	}
}
