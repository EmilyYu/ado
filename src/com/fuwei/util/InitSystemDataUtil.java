package com.fuwei.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


import com.fuwei.DAO.GongXuDAO;

import com.fuwei.entity.Company;
import com.fuwei.entity.CompanySalesMan;
import com.fuwei.entity.Developer;
import com.fuwei.entity.GongXu;

public class InitSystemDataUtil {
	
	public static List<CompanySalesMan> initSalesmanList(){
		
		
		return null;
	}
	public static HashMap<String, List<CompanySalesMan>> initCompanySalesmanSpell(){
		return null;
	}
	
	
	public  static HashMap<String, List<CompanySalesMan>> initSalesmanByCompany(){
		return null;
	}
	
	public static HashMap<String, List<Developer>> initDeveloperSpell(){
		return null;
	}
	
	public static HashMap<String, List<Company>> initCompanyNameSpell() {
		return null;
	}
	
	

	
	public static List<Company> initCompanyName(){
		return null;
	}
	
	public static List<Company> initCompanyList(){
		return null;
	}
	
	
	public static List<String> initGongXu(){
		List<String> gongXuString = new ArrayList<String>();
		GongXuDAO gongXuDAO = new GongXuDAO();
		List<GongXu> gongXus = (List<GongXu>) gongXuDAO.getAllGongXu();
		for (GongXu gongXu : gongXus) {
			gongXuString.add(gongXu.getName());
		}
		return gongXuString;
	}
	

	
	public static List<Developer> initDeveloperList(){
		return null;
	}
}
