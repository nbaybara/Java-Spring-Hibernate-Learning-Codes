package com.nur.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//call methods on the bean 
		System.out.println(theCoach.getDailyWork());
		System.out.println(theCoach.getDailyFortune());
		CricketCoach C= new CricketCoach();
		//System.out.println(C.setFortuneService(fortuneService));
		//close the context
		context.close();
	}

}
