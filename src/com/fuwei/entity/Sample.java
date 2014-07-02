package com.fuwei.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Sample {
	private int id;
	private String picturePath;
	private String material;
	private double weight;
	private String size;
	private String detail;
	private Date date;
	private double cost;
	private String productNumber;
	private int developerId;
	private String machine;
	private String memo;
	
	
	
	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
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
	public String getMachine() {
		return machine;
	}
	public void setMachine(String machine) {
		this.machine = machine;
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		String string="id:"+id+
		"\npicturePath:"+picturePath+
		"\nproductNumber:"+productNumber+
		"\nmaterial:"+material+
		"\nweight:"+weight+
		"\nsize:"+size+
		"\ndetail:"+detail+
		"\ndate:"+date.toString()+
		"\ncost:"+cost;
		return string;
	}
	
	
	

}
