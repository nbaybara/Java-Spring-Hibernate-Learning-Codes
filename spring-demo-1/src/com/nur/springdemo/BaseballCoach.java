package com.nur.springdemo;

public class BaseballCoach implements Coach{

	//Private field for dependency
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	public BaseballCoach() {
		
	}
	
	public String getDailyWork() {
		return "Practice 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

	
}
