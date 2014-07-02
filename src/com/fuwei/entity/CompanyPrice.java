package com.fuwei.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*公司报价*/
@Entity
public class CompanyPrice {

	private int id;
	private String productName;
	private int companyId;
	private int salesManId;
	private double price;
	private Date time;
	private String memo;
	private int sampleId;
	
	
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getSalesManId() {
		return salesManId;
	}
	public void setSalesManId(int salesManId) {
		this.salesManId = salesManId;
	}
	
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	//	public String getNote() {
//		return note;
//	}
//	public void setNote(String note) {
//		this.note = note;
//	}
	public int getSampleId() {
		return sampleId;
	}
	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
//	public String getCompanyName() {
//		return companyName;
//	}
//	public void setCompanyName(String companyName) {
//		this.companyName = companyName;
//	}
//	public String getSalesMan() {
//		return salesMan;
//	}
//	public void setSalesMan(String salesMan) {
//		this.salesMan = salesMan;
//	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
}
