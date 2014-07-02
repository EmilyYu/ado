package com.fuwei.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/*公司类*/
@Entity(name="tb_module")
public class Module {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;//模块名称
	private String url;//模块url
	private String decription;//模块描述
	private boolean inUse;//是否启用
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public boolean isInUse() {
		return inUse;
	}
	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
	
	
	
}
