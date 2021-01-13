package com.qa.main;

public class Bird extends Animal{

	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public String itEats() {
		return null;
	}

	@Override
	public int eyes() {
		return 0;
	}

}
