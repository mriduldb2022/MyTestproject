package com.inheritance;

public class ClassA { // GRANDPARENTS
	
	
	
	void student() {   // Because this is not a static method, 
						// we have to create a new object to call the method 
						//from the main method to print it
		
		System.out.println("This is a student");
		
	}
	
	void teacher() {
		System.out.println("This is a teacher");
}
	
	int laptops() {
	return 10;
	}
	
	static void whiteboard() {
		System.out.println("We write on the whiteboard");
	}
	
public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		obj.student();
		obj.teacher();
	
		
	}
	
	
}
