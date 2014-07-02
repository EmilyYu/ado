package com.fuwei.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fuwei.entity.Company;
import com.fuwei.entity.CompanySalesMan;
import com.fuwei.entity.Developer;

public class FuweiSystemData {
	public static final int ADD_QUOTATION = 2;
	public static final int ALL_QUOTATION = 3;
	// ===================
	public static final int BASE_COMPANY = 2;
	public static final int BASE_COMPANY_SALESMAN = 4;

	public static final int BASE_DEVELOPER = 3;
	public static final int BASE_PRODUCT_NUMBER = 1;

	public static final int DEFAULT_PAGE = 1;
	public static final int DEFAULT_PERPAGE = 10;
	public static final int DEFAULT_SEARCH_TYPE = 0;
	
	//权限
	public static final int AUTHORITY_MANAGER=1;
	//普通权限
	
	public static final int AUTHORITY_GENERAL=3;
	// 报价单参数 必须大于0
	public static final int DELETE_QUOTATION = 1;
	

	private static List<String> gongXuList = new ArrayList<String>();
	
	private static List<Company> companyList = new ArrayList<Company>();
	private static List<CompanySalesMan> salesmanList = new ArrayList<CompanySalesMan>();
	
	

	public static List<String> getGongXuList() {
		return gongXuList;
	}


	public static void setGongXuList(List<String> gongXuList) {
		FuweiSystemData.gongXuList = gongXuList;
	
	}



}
