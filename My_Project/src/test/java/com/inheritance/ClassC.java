package com.inheritance;

public class ClassC extends ClassB{ // CHILDREN 

	void books() {
		System.out.println("These are the books");
	}
	
	
	public static void main(String[] args) {
		
		ClassC obj = new ClassC();
		obj.student();
		obj.teacher();
		obj.principal();
	}
	
	
	
	
}
