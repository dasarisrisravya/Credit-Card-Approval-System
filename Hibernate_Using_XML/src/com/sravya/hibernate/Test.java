package com.sravya.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setName("Swathi");
		customer.setPanNo("AAAEC6356C");
		customer.setState("telangana");
		customer.setCountry("India");
		customer.setPhone(1234567890);
		customer.setMail("swathi@gmail.com");
		customer.setAccountNo(563467);
		customer.setCreditscore(500);
		session.save(customer);
		
		Customer customer1 = new Customer();
		customer1.setName("Asiya");
		customer1.setPanNo("AECEA6789C");
		customer1.setState("telangana");
		customer1.setCountry("India");
		customer1.setPhone(1345678293);
		customer1.setMail("asiya@gmail.com");
		customer1.setAccountNo(566789);
		customer1.setCreditscore(700);
		session.save(customer1);
		
		transaction.commit();
		session.close();
		System.out.println("Hibernate for creditcard approval is successful");
	}
		
	}

