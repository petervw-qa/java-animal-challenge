package com.qa.main;

public class Fish extends Animal implements Swimable{

	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public String itEats() {
		return "specify fish";
	}

	@Override
	public int eyes() {
		return 0;
	}

	@Override
	public String swim() {
		return null;
	}

}
