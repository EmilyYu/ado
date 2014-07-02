package com.fuwei.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*本公司 ，跟单人类*/
@Entity
public class Developer {
	private int id;
	private String name;
	private String jianChen;
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
	public String getJianChen() {
		return jianChen;
	}
	public void setJianChen(String jianChen) {
		this.jianChen = jianChen;
	}
}
