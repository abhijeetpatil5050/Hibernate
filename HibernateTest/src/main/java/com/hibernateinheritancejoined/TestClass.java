package com.hibernateinheritancejoined;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {
	
	public static void main(String[] args) {
		
		SessionFactory sfactory = new Configuration().configure().buildSessionFactory();
		Session session = sfactory.openSession();
		Transaction tr =   session.beginTransaction();
		
		Car c = new Car(12, "CName");
		session.save(c);
		
		Car s = new Swift(13, "Swift", 18, 200);
		session.save(s);
		
		Car i = new I20(14, "I20", 21, 150);
		session.save(i);
				
		session.flush();
		tr.commit();
		
	}

}
