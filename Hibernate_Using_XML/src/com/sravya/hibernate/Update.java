package com.sravya.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, 1 );
		customer.setName("Keerthi");
		customer.setState("chennai");
		session.save(customer);
		transaction.commit();
		session.close();
		

	}

}
