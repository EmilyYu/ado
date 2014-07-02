package com.fuwei.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/*生产通知单*/
@Entity
public class ProductionNotification {
	private int id;/*主键，生产通知单Id*/
	private int fworderID;/*订单号*/
	//加工单位
	private String jiagongdanwei;/*加工单位*/
	//生产通知单号
	private String notificationNumber;
//	private String companyName;
	private int companyId;
	
//	private List<SamplePrice> products;
	//订单号
	private String fworderNumber;
//	
//	
	//货号
	private String styleNumber;
	//产品名称
	private String productName;
	//生产计划数
	private int exceptProductQuantity;
	//产品克重
	private double kezhong;
	private String pictureName;
	
	//交货日期
	private Date deadlineTime;
	
	//机器针型
	private String machineZhenXing;
	
	//备注
	private String memo;
	
	
	private Date creatTime;
	//内容json字符串  json数组， json对象内容：色号，色别，尺寸，生产数量，材料名称，材料数量，损耗，总材料
	private String contentJSONString;
	
	
	
	
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFworderID() {
		return fworderID;
	}
	public void setFworderID(int fworderID) {
		this.fworderID = fworderID;
	}
	public String getJiagongdanwei() {
		return jiagongdanwei;
	}
	public void setJiagongdanwei(String jiagongdanwei) {
		this.jiagongdanwei = jiagongdanwei;
	}
	public String getNotificationNumber() {
		return notificationNumber;
	}
	public void setNotificationNumber(String notificationNumber) {
		this.notificationNumber = notificationNumber;
	}

	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getFworderNumber() {
		return fworderNumber;
	}
	public void setFworderNumber(String fworderNumber) {
		this.fworderNumber = fworderNumber;
	}
	public String getStyleNumber() {
		return styleNumber;
	}
	public void setStyleNumber(String styleNumber) {
		this.styleNumber = styleNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getExceptProductQuantity() {
		return exceptProductQuantity;
	}
	public void setExceptProductQuantity(int exceptProductQuantity) {
		this.exceptProductQuantity = exceptProductQuantity;
	}
	public double getKezhong() {
		return kezhong;
	}
	public void setKezhong(double kezhong) {
		this.kezhong = kezhong;
	}
	public Date getDeadlineTime() {
		return deadlineTime;
	}
	public void setDeadlineTime(Date deadlineTime) {
		this.deadlineTime = deadlineTime;
	}
	public String getMachineZhenXing() {
		return machineZhenXing;
	}
	public void setMachineZhenXing(String machineZhenXing) {
		this.machineZhenXing = machineZhenXing;
	}
//	public String getNote() {
//		return note;
//	}
//	public void setNote(String note) {
//		this.note = note;
//	}
	public String getPictureName() {
		return pictureName;
	}
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public String getContentJSONString() {
		return contentJSONString;
	}
	public void setContentJSONString(String contentJSONString) {
		this.contentJSONString = contentJSONString;
	}
}
