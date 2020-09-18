package com.nur.hibernate.d;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nur.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		// create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		
		try {			
			int studentId=1;
			session=factory.getCurrentSession();
			session.beginTransaction();
			//retrieve student based on the id: primary key
			System.out.println("\nGet student with id: "+studentId);
			Student myStudent=session.get(Student.class, studentId);
			System.out.println("Updating student...");
			myStudent.setFirstName("Scooby");
			session.getTransaction().commit();
			
			//NEW CODE
			session =factory.getCurrentSession();
			session.beginTransaction();
			//update email for all students
			System.out.println("Update email for all students");
			session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();
			
			session.getTransaction().commit();
			
			
			System.out.println("Done!");
			
		}
			
			finally {
				factory.close();
			}
		

	}

}
