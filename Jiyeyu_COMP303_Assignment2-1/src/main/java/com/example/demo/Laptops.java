package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Laptops")
public class Laptops {
	
	@Id
	@Column(name = "laptopId")
	public int laptopId;
	
	@Column(name = "ltype")
	public String ltype;
	
	@Column(name = "price")
	public double price;
	
	@Column(name = "lsize")
	public String lsize;
	
	@Column(name = "lnum")
	public int lnum;
	
	
	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLtype() {
		return ltype;
	}
	public void setLtype(String ltype) {
		this.ltype = ltype;
	}
	public double getPrice() {
		
		double totalPrice = 0.00;
		
		switch(lsize) {
		case "13 inch":

			totalPrice = 1.3;
			break;
			
		case "15 inch":

			totalPrice = 1.5;
			break;
			
		case "16 inch":

			totalPrice = 1.6;
			break;
		
		default:
			
		}
		
		switch(ltype)
		{
		case "MacBook Pro":

			totalPrice = 2000.00;
			break;
			
		case "MackBook Air":

			totalPrice = 1800.00;
			break;
			
		case "Chromebook":

			totalPrice = 1600.00;
			break;
			
		case "LG Gram":

			totalPrice = 1500.00;
			break;
			
		case "Netbook":

			totalPrice = 1400.00;
			break;
			
		case "Lenovo":

			totalPrice = 1300.00;
			break;
			default:
				
			}
			totalPrice = totalPrice * lnum;
			
			//to decimal
			double amountpaid = Math.round(totalPrice * 100) / 100.0;
			return amountpaid;
		}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getLsize() {
		switch(lsize)
		{
		case "13 inch":

			lsize = "13 inch";
			break;
			
		case "15 inch":

			lsize = "15 inch";
			break;
			
		case "16 inch":

			lsize = "16 inch";
			break;
			
		}
		
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
	
	
	
	
	
	
	public Laptops() {}

	public Laptops(int laptopId, String ltype, double price, String lsize) {
		super();
		this.laptopId = laptopId;
		this.ltype = ltype;
		this.price = price;
		this.lsize = lsize;
	}
	
	public Laptops(String ltype, double price, String lsize) {
		super();
		this.ltype = ltype;
		this.price = price;
		this.lsize = lsize;
	}
	
	public Laptops(String ltype, String lsize) {
		super();
		this.ltype = ltype;
		this.lsize = lsize;

	}
	

}
