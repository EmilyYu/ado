package com.fuwei.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="tb_role_module")
public class Role_Module {
	
	private int id;
	
	private Role role;
	
	private Module module;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@ManyToOne(targetEntity=Role.class) 
	@JoinColumn(name="roleId")  
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	@ManyToOne(targetEntity=Module.class)
	@JoinColumn(name="moduleId")
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	

}
