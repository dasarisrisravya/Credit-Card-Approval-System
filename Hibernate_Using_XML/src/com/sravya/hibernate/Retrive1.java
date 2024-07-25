package com.sravya.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Retrive1 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from Customer");
		List list = query.list();
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			Customer customer=(Customer)itr.next();
			System.out.println(customer.getId()+" "+customer.getName());
			Customer customer1=(Customer)itr.next();
			System.out.println(customer1.getCountry()+" "+customer1.getPanNo());
		}
		System.out.println("Retrived successfully");
	}

}
