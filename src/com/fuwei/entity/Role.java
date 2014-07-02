package com.fuwei.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/*公司类*/
@Entity(name="tb_role")
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;//角色名称
	private String decription;//角色描述
	private Date created_at;// 创建时间
	private Date updated_at;// 最近更新时间
	
	@ManyToOne(targetEntity=FWUser.class)
	@JoinColumn(name="created_user")
	private FWUser created_user;//创建用户
	

	
	public FWUser getCreated_user() {
		return created_user;
	}

	public void setCreated_user(FWUser created_user) {
		this.created_user = created_user;
	}
	
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
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
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
	
	
}
