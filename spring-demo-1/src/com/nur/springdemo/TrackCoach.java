package com.nur.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneservice;
	
	
	public TrackCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "run a  hard 5 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it!"+ fortuneservice.getDailyFortune();
	}

}
