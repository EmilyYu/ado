package com.fuwei.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/*公司类*/
@Entity(name="tb_company")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;// 客户ID

	private String companyNumber;// 客户号

	// private String companyName;

	private int level;// 客户等级

	private Date created_at;// 创建时间

	private Date updated_at;// 最近更新时间

	private String address;// 详细地址：区-镇-街道等

	private String city;// 城市

	private String country;// 国家

	private String shortname;// 公司简称

	private String fullname;// 公司全称
	
	private String help_code;//拼音简称
	
	
	@ManyToOne(targetEntity=FWUser.class)
	@JoinColumn(name="created_user")
	private FWUser created_user;//创建用户
	
	public FWUser getCreated_user() {
		return created_user;
	}

	public void setCreated_user(FWUser created_user) {
		this.created_user = created_user;
	}
	
	
	public String getHelp_code() {
		return help_code;
	}
	
	public void setHelp_code(String help_code) {
		this.help_code = help_code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	
	
	
}
