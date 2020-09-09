package com.nur.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//load spring configuration file
				ClassPathXmlApplicationContext context=
						new ClassPathXmlApplicationContext("applicationContext.xml");
				//retrieve bean from container
				CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
				//call methods on the bean 			
				//...
				System.out.println(theCoach.getDailyFortune());
				System.out.println(theCoach.getDailyWork());
				System.out.println(theCoach.getTeam());
				//close the context
				context.close();

	}

}
