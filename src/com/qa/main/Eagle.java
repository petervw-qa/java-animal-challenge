package com.qa.main;

public class Eagle extends Bird implements Flyable{
	
	public int feathers = 5000;
	
	public String swoop() {
		return "i did a swoop";
	}
	
	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public String itEats() {
		return "rodents";
	}

	@Override
	public int eyes() {
		return 2;
	}

	@Override
	public String toString() {
		return "Eagle [exists()=" + exists() + ", itEats()=" + itEats() + ", eyes()=" + eyes() + "]";
	}

	@Override
	public String fly() {
		return "super fast wheeeeeee";
	}
	
	

}
