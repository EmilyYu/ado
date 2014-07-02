package com.fuwei.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class DeliveryInfo {
	private int id;
	private int styleINOrderID;
	//总箱数
	private int totalBoxQuantity;
	//每大箱里的小包数
	private int perBigBoxQuantity;
	//每小包里的数量
	private int perSmallBoxQuantity;
	//发货总件数
	private int totalQuantity;
	private Date deliveryTime;
	//外箱尺寸
	private String boxSize;
	
	private boolean isDelivery;
	
	private String actualDeliveryTime;
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

	public int getTotalBoxQuantity() {
		return totalBoxQuantity;
	}

	public void setTotalBoxQuantity(int totalBoxQuantity) {
		this.totalBoxQuantity = totalBoxQuantity;
	}

	public int getPerBigBoxQuantity() {
		return perBigBoxQuantity;
	}

	public void setPerBigBoxQuantity(int perBigBoxQuantity) {
		this.perBigBoxQuantity = perBigBoxQuantity;
	}

	public int getPerSmallBoxQuantity() {
		return perSmallBoxQuantity;
	}

	public void setPerSmallBoxQuantity(int perSmallBoxQuantity) {
		this.perSmallBoxQuantity = perSmallBoxQuantity;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getBoxSize() {
		return boxSize;
	}

	public void setBoxSize(String boxSize) {
		this.boxSize = boxSize;
	}

	public boolean isDelivery() {
		return isDelivery;
	}

	public void setDelivery(boolean isDelivery) {
		this.isDelivery = isDelivery;
	}

	public String getActualDeliveryTime() {
		return actualDeliveryTime;
	}

	public void setActualDeliveryTime(String actualDeliveryTime) {
		this.actualDeliveryTime = actualDeliveryTime;
	}
	
	
}
