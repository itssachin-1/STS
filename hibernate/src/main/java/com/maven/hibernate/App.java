package com.maven.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		System.out.println("Project is running fine!");

//		Configuration cfg = new Configuration();
//		cfg.configure();
//		SessionFactory factory = cfg.buildSessionFactory();

//		In short we can write above lines as:
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

//		System.out.println(factory);
//		System.out.println(factory.isClosed());

		Student stud = new Student();
		stud.setId(01);
		stud.setName("xyz");
		stud.setCity("Gaya");

		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(stud);
		tx.commit();
		ses.close();
	}
}
