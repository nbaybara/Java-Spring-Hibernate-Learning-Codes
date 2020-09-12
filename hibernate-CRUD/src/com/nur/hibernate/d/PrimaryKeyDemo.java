package com.nur.hibernate.d;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nur.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		try {			
			//create 3 students object to save Java object
			
			System.out.println("Creating new student object...");
			Student tempStudent1 = new Student("Nur","BAYBARA","nbaybara.com");
			Student tempStudent2 = new Student("Elif","Gökce","mary@com");
			Student tempStudent3 = new Student("Merve","BAYBARA","merve@com");
			//start a transaction
			session.beginTransaction();
			//save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.save(tempStudent1);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
			
			finally {
				factory.close();
			}
		

	}

}
