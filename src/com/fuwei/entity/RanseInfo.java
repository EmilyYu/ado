package com.fuwei.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class RanseInfo {
	private int id;
	private int styleINOrderID;
	private String ranchang;
	private String productNumber;
	private Date createTime;
	private String productName;
	private Date deliveryTime;
	private String colorInfoJSONString;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStyleINOrderID() {
		return styleINOrderID;
	}
	public void setStyleINOrderID(int styleINOrderID) {
		this.styleINOrderID = styleINOrderID;
	}
	public String getRanchang() {
		return ranchang;
	}
	public void setRanchang(String ranchang) {
		this.ranchang = ranchang;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getColorInfoJSONString() {
		return colorInfoJSONString;
	}
	public void setColorInfoJSONString(String colorInfoJSONString) {
		this.colorInfoJSONString = colorInfoJSONString;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
