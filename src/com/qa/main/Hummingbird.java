package com.qa.main;

public class Hummingbird extends Bird implements Flyable{
	
	public boolean fastPeck = true;
	
	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public String itEats() {
		return "insects";
	}

	@Override
	public int eyes() {
		return 2;
	}

	@Override
	public String toString() {
		return "Hummingbird [exists()=" + exists() + ", itEats()=" + itEats() + ", eyes()=" + eyes() + "]";
	}

	@Override
	public String fly() {
		return "wheeeeee";
	}
	
	

}
