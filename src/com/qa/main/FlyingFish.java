package com.qa.main;

public class FlyingFish extends Fish implements Flyable{
	
	public String doAJump() {
		return "look how high I can go!!";
	}
	
	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public String itEats() {
		return "plankton";
	}

	@Override
	public int eyes() {
		return 2;
	}

	@Override
	public String fly() {
		return "woah i'm actually flying";
	}

}
