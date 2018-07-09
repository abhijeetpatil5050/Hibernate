package com.hibernateinhertance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {
	
	public static void main(String[] args) {
		
		SessionFactory sfactory = new Configuration().configure().buildSessionFactory();
		Session session = sfactory.openSession();
		Transaction tr =   session.beginTransaction();
		
		Parent parent = new Parent("BABA", 10);
		session.save(parent);
		
		Parent child1 = new Child1("BABA", 11, "ABHI");
		session.save(child1);
		
		Parent child2 = new Child2("NAN", 13, "INDRA");
		session.save(child2);
				
		session.flush();
		tr.commit();

		
	}

}
