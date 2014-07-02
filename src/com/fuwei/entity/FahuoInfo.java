package com.fuwei.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class FahuoInfo {
	private int id;
	//总箱数
	private int totalBoxQuantity;
	//每箱小包数量
	private int perBoxQuantity;
	//每箱总件数
	private int totalPerBoxProductQuantity;
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalBoxQuantity() {
		return totalBoxQuantity;
	}
	public void setTotalBoxQuantity(int totalBoxQuantity) {
		this.totalBoxQuantity = totalBoxQuantity;
	}
	public int getPerBoxQuantity() {
		return perBoxQuantity;
	}
	public void setPerBoxQuantity(int perBoxQuantity) {
		this.perBoxQuantity = perBoxQuantity;
	}
	public int getTotalPerBoxProductQuantity() {
		return totalPerBoxProductQuantity;
	}
	public void setTotalPerBoxProductQuantity(int totalPerBoxProductQuantity) {
		this.totalPerBoxProductQuantity = totalPerBoxProductQuantity;
	}
	public Date getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public int getTotalDeliverQuantity() {
		return totalDeliverQuantity;
	}
	public void setTotalDeliverQuantity(int totalDeliverQuantity) {
		this.totalDeliverQuantity = totalDeliverQuantity;
	}
	public String getColorAndQuantityJSONString() {
		return colorAndQuantityJSONString;
	}
	public void setColorAndQuantityJSONString(String colorAndQuantityJSONString) {
		this.colorAndQuantityJSONString = colorAndQuantityJSONString;
	}
	private Date deliveryTime;
	//发货总件数
	private int totalDeliverQuantity;
	private String colorAndQuantityJSONString;
}
