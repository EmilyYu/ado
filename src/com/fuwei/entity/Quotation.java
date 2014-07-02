package com.fuwei.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*等待报价类*/
@Entity
public class Quotation {
	private int id;
	private int companyPriceID;
	private Date createTime;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCompanyPriceID() {
		return companyPriceID;
	}
	public void setCompanyPriceID(int companyPriceID) {
		this.companyPriceID = companyPriceID;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
