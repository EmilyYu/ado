package com.fuwei.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="tb_gongxu")
public class GongXu {
	private int id;
	private String name;
	private Date created_at;// 创建时间
	private Date updated_at;// 最近更新时间
	
	private FWUser created_user;//创建用户
	

	@ManyToOne(targetEntity=FWUser.class)
	@JoinColumn(name="created_user")
	public FWUser getCreated_user() {
		return created_user;
	}

	public void setCreated_user(FWUser created_user) {
		this.created_user = created_user;
	}
	
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
