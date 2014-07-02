package com.fuwei.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	static {
		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
		annotationConfiguration.configure();
		sessionFactory = annotationConfiguration.buildSessionFactory();
	}

	public static Session getSession() {
		return sessionFactory.openSession();
	}

}
