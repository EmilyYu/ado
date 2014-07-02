package com.fuwei.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fuwei.entity.GongXu;
import com.fuwei.util.HibernateUtil;

public class GongXuDAO {
	
	private Session session;

	public GongXuDAO() {
	}
	
	
	public int addGongXu(GongXu gongXu){
		try {
			session = HibernateUtil.getSession();
			Transaction transaction = session.beginTransaction();
			session.save(gongXu);
			transaction.commit();
			session.close();
			return gongXu.getId();
		} catch (HibernateException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public Object getAllGongXu(){
		session = HibernateUtil.getSession();
		String hql = "from GongXu as gongxu";
		Query query = session.createQuery(hql);
		return query.list();
	}
}
