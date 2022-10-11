package com.abstraction;

public class RemoteFunctions extends Remote{

	
	void PowerButtons() {
		
		System.out.println("The power buttons turns on the tv");
	}

	
	void NumberButton() {
		
		System.out.println("We can change channels with this");
	}

	public static void main(String[] args) {
		
		RemoteFunctions obj = new RemoteFunctions();
		obj.PowerButtons();
		obj.NumberButton();
		obj.StartButton();
		obj.VolumeButton();
	}
}
