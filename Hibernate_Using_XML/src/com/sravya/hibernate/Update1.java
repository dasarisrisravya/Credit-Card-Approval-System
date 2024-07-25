package com.sravya.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update1 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update Customer set name=:n where id=:i");
		query.setParameter("n", "Nalini");
		query.setParameter("i", 1);
		int status = query.executeUpdate();
		System.out.println(status);
		transaction.commit();
		session.close();
		System.out.println("Updated successfully");
	}

}
