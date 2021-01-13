package com.qa.main;

public class Penguin extends Bird implements Swimable{
	
	public boolean canItFly = false;
	
	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public String itEats() {
		return "fish";
	}

	@Override
	public int eyes() {
		return 2;
	}

	@Override
	public String toString() {
		return "Penguin [exists()=" + exists() + ", itEats()=" + itEats() + ", eyes()=" + eyes() + "]";
	}

	@Override
	public String swim() {
		return "I'm swimming!";
		
	}
	
	

}
