package com.abstraction;

public abstract class Driving {

	abstract void engine(); //abstract 
	
	
	
	void steering() {   //non-abstract 
		System.out.println("Stearing left or right ");
	}
	
	
	
	//abstract class will allow create main method but not allow Object creation.
	public static void main(String[] args) {
		
		
	}
	
	
	
}
