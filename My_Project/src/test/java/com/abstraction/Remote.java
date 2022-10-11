package com.abstraction;

public abstract class Remote {
	
	//(){} is the method body.
	
	abstract void PowerButtons(); //don't need method body
	//25% abstraction 
	abstract void NumberButton();
	////25% abstraction 
	
	void StartButton() { // Have method body ////25% non-abstraction
		System.out.println("This button starts the tv");
	}
	
	void VolumeButton() { //Have method body 25% non-abstraction 
		System.out.println("This button changes the sound level");
	}

}
