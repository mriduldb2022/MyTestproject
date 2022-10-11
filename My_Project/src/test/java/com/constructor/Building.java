package com.constructor;

public class Building {
	// Because the method name Building has the same name as the class name;
	// building, it is a constructor.
	// OVERLOADING is allowed in constructor. However overriding is NOT!
	Building() {

		System.out.println("Adding new tiles to the kitchen");

	}

	Building(int floors) {
		System.out.println("The building has " + floors + " floors total ");
	}

//	Building(int floors, int windows) {
//		System.out.println("The building has " + floors + " floors total " + " and " + windows + " windows totals ");
//	}
//	
	
	
	
	public static void main(String[] args) {

		Building obj = new Building();
	
	}

}
