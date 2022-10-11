package com.abstraction;

public class CellPhoneFunctions implements CellPhone{

	public void screen() {
		
		System.out.println(" This is cellphone screen ");
	}

	public void speakers() {
		
		System.out.println(" Speakers are loud ");
	}

	public void calls() {
		
		System.out.println(" I can make calls here ");
	}

	public static void main(String[] args) {
		
		CellPhoneFunctions obj = new CellPhoneFunctions();
		obj.screen();
		obj.calls();
		obj.speakers();
		
	}
}
