package com.fuwei.listener;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


import com.fuwei.entity.FWUser;

import com.fuwei.util.FuweiSystemData;
import com.fuwei.util.InitSystemDataUtil;

public class InitPinyinDateListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {

	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("初始化容器");
//		initCompanyNameSpell();
//		initDeveloperSpell();
//		initCompanySalesmanSpell();
		initGongXu();
//		initSalesManByCompany();
//		initCompanyName();
//		initDeveloperName();
//		initUser();
//		initSalesmanList();
	}
	
	private void initSalesmanList() {
		
	}
	
	private void initDeveloperName() {
		
	}

	private void initCompanyName() {
		
	}

	private void initCompanyNameSpell() {
		
	}

	private void initDeveloperSpell() {
		
	}

	private void initCompanySalesmanSpell() {
	
	}
	
	private void initSalesManByCompany() {
		
	}

	private void initGongXu() {
		FuweiSystemData.setGongXuList(InitSystemDataUtil.initGongXu());
	}
	
	private void initUser(){
		
	}

	

}
