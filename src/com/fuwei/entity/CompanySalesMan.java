package com.fuwei.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*业务员类*/
@Entity(name="tb_salesman")
public class CompanySalesMan {
	private int id;
	private String name;
	private String help_code;/*拼音简称*/
	private String tel; //手机或者电话
	
//	private int companyId;/*公司外键*/
	private Company company;
	
	private Date created_at;// 创建时间
	private Date updated_at;// 最近更新时间
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHelp_code() {
		return help_code;
	}
	public void setHelp_code(String help_code) {
		this.help_code = help_code;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
//	public int getCompanyId() {
//		return companyId;
//	}
//	public void setCompanyId(int companyId) {
//		this.companyId = companyId;
//	}
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
	
	@ManyToOne(targetEntity=Company.class)
	@JoinColumn(name="companyId")  
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	

	
	
	
}
