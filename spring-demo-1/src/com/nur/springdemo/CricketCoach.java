package com.nur.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String team;
	private String emailAddress;
	

	public String getTeam() {
		
		return team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Ýnside setTeam method");

		this.team = team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("Ýnside setEmail method");

	}

	public CricketCoach() {
		System.out.println("No-arg constructor(CricketCoach)");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Ýnside setFortuneService method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "Lucky day from cricketCoach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricketcoah-> WORK!";
	}

}
