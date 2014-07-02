package com.fuwei.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StyleINOrder {
	private int id;
	//图片名
	private String pictureName;
	//款号
	private String styleNumber;
	//款名
	private String styleName;
	//材料成分
	private String material;
	//纱支
	private String shazhi;
	//颜色
	private String color;
	private String size;
	private double kezhong;
	//数量
	private int quantity;
	private double price;
	//预计用纱量 单位公斤
	private double expectedMaterialTotal;
	
	private int FWOrderID;
	private String memo;
	
	
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
	public int getFWOrderID() {
		return FWOrderID;
	}
	public void setFWOrderID(int orderID) {
		FWOrderID = orderID;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPictureName() {
		return pictureName;
	}
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	public String getStyleNumber() {
		return styleNumber;
	}
	public void setStyleNumber(String styleNumber) {
		this.styleNumber = styleNumber;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getShazhi() {
		return shazhi;
	}
	public void setShazhi(String shazhi) {
		this.shazhi = shazhi;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getKezhong() {
		return kezhong;
	}
	public void setKezhong(double kezhong) {
		this.kezhong = kezhong;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getExpectedMaterialTotal() {
		return expectedMaterialTotal;
	}
	public void setExpectedMaterialTotal(double expectedMaterialTotal) {
		this.expectedMaterialTotal = expectedMaterialTotal;
	}
	
}


