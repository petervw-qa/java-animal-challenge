package com.qa.main;

public class Magikarp extends Fish {
	
	public String magikarpDoSplash() {
		return "Magikarp does a splash";
	}
	
	public String magikarpDoStruggle() {
		return "Magikarp struggles. It's ineffective.";
	}
	
	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public String itEats() {
		return "other pokemon";
	}

	@Override
	public int eyes() {
		return 2;
	}
	

}
