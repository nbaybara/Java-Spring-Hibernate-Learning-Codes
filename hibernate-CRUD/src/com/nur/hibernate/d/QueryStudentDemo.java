package com.nur.hibernate.d;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nur.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		try {			
			//start a transaction
			session.beginTransaction();
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			//display student
			displayStudent(theStudents);
			//query students: lastName=""
			theStudents=session.createQuery("from Student s where s.lastName='Baybara'").getResultList();
			System.out.println("Student who have last name of Bay");
			displayStudent(theStudents);
			theStudents=session.createQuery("from Student s where"
					+ " s.lastName='Ece' OR s.firstName='XYZ '").getResultList();
		System.out.println("Query With OR: \n");
		displayStudent(theStudents);
			
			
			
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
			
			finally {
				factory.close();
			}
		

	}

	private static void displayStudent(List<Student> theStudents) {
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
