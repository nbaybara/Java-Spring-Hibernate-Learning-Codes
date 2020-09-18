package com.nur.hibernate.d;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nur.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		// create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		try {			
			//create a student object to save Java object
			
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Meryem","Ece","ece@com");
			//start a transaction
			session.beginTransaction();
			//save the student object
			System.out.println("Saving the student...");
			System.out.println(tempStudent);
			session.save(tempStudent);
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Student id"+tempStudent.getId());
			
			//New Code
			//get a new session and start transaction
			session= factory.getCurrentSession();
			session.beginTransaction();
			//retrieve student based on the id: primary key
			System.out.println("\nGet student with id: "+tempStudent.getId());
			Student myStudent=session.get(Student.class, tempStudent.getId());
			//commit the transaction
			System.out.println("Get complete: " + myStudent);
			System.out.println("Done!");
			
		}
			
			finally {
				factory.close();
			}
		

	}

}
