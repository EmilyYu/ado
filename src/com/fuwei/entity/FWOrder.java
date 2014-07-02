package com.fuwei.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class FWOrder {
	private int id;
	//公司合同号
	private String companyOrderNumber;
	//工厂合同号  自动生成
	private String fwOrderNumber;
	
	private int quoteId;//报价单Id,外键
	private double price;//订单总价
	private Date created_at;//订单创建时间
	private Date updated_at;//订单更新时间
	private Date start_at;//合同开始时间
	private Date end_at;//合同截止时间，交货时间
	private int status;//订单当前状态
	private String state;//当前进度情况
	
	private List<SamplePrice> samplelist;//商品列表
	private int companyId;//公司Id
	private int salesmanId;//业务员Id
	private String memo;//备注
	
	
	private QuotationList quote;
//
//	//公司名称
//	private String companyName;
//	//下单时间
//	private Date orderTime;
//	//公司业务员
//	private String salesManName;
//	//工厂跟单人员
//	private String developer;
//	
//	private String note;
	
	@Transient
	public QuotationList getQuote() {
		return quote;
	}
	public void setQuote(QuotationList quote) {
		this.quote = quote;
	}
	public int getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Date getStart_at() {
		return start_at;
	}
	public void setStart_at(Date start_at) {
		this.start_at = start_at;
	}
	public Date getEnd_at() {
		return end_at;
	}
	public void setEnd_at(Date end_at) {
		this.end_at = end_at;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Transient
	public List<SamplePrice> getSamplelist() {
		return samplelist;
	}
	public void setSamplelist(List<SamplePrice> samplelist) {
		this.samplelist = samplelist;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getSalesmanId() {
		return salesmanId;
	}
	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
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
//	public String getSalesManName() {
//		return salesManName;
//	}
//	public void setSalesManName(String salesManName) {
//		this.salesManName = salesManName;
//	}
//	public Date getOrderTime() {
//		return orderTime;
//	}
//	public void setOrderTime(Date orderTime) {
//		this.orderTime = orderTime;
//	}
//
//	public String getDeveloper() {
//		return developer;
//	}
//	public void setDeveloper(String developer) {
//		this.developer = developer;
//	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyOrderNumber() {
		return companyOrderNumber;
	}
	public void setCompanyOrderNumber(String companyOrderNumber) {
		this.companyOrderNumber = companyOrderNumber;
	}
	public String getFwOrderNumber() {
		return fwOrderNumber;
	}
	public void setFwOrderNumber(String fwOrderNumber) {
		this.fwOrderNumber = fwOrderNumber;
	}
//	public String getCompanyName() {
//		return companyName;
//	}
//	public void setCompanyName(String companyName) {
//		this.companyName = companyName;
//	}

}
