package com.qa.main;

public class Runner {
	public static void main(String[] args) {

		Eagle BaldEagle = new Eagle();
		System.out.println(BaldEagle.swoop());
		
		Animal LargeMagikarp = new Magikarp();
		System.out.println(LargeMagikarp.itEats());
		
		Bird EmperorPenguin = new Penguin();
		System.out.println(EmperorPenguin.itEats());
		
	}
	

}
