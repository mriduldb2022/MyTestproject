package com.superClass;

public class Cat extends animal{

	public void animalSound() {
		super.animalSound();
		System.out.println("The cat says: Meaw");
	}
	
	
	public static void main(String[] args) {
		 animal myCat = new Cat();
		 myCat.animalSound();
		
	}
}
