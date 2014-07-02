package com.fuwei.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*未核算样品*/
@Entity
public class UnPricedSample {
	private int id;
	private String picturePath;
	private String material;//材料
	private double weight;//克重
	private String size;
	private Date date;
	private String productNumber;
	private int developerId;
	private String machine;
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
	public String getMachine() {
		return machine;
	}
	public void setMachine(String machine) {
		this.machine = machine;
	}
	
	
	
	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	
	//	public String getDeveloper() {
//		return developer;
//	}
//	public void setDeveloper(String developer) {
//		this.developer = developer;
//	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPicturePath() {
		return picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		String string="id:"+id+
		"\npicturePath:"+picturePath+
		"\nproductNumber:"+productNumber+
		"\nmaterial:"+material+
		"\nweight:"+weight+
		"\nsize:"+size+
		"\ndate:"+date.toString();
		return string;
	}
	
	
	

}
